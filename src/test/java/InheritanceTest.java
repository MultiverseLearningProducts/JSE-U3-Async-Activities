/**
 * Tests for Inheritance implementation - 3-4 Solution
 * This test verifies that students have completed the inheritance task correctly.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class InheritanceTest {
    
    /**
     * Main test runner for Inheritance tests.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Testing Inheritance Implementation ===");
        System.out.println("This test verifies that you have completed 3-4-solution correctly.");
        System.out.println();
        
        TestFramework.reset();
        
        // Test 1: Check if Product class exists and compiles
        testProductClassExists();
        
        // Test 2: Check if Product has displayInfo method
        testProductHasDisplayInfo();
        
        // Test 3: Check if DigitalProduct class exists
        testDigitalProductClassExists();
        
        // Test 4: Check if DigitalProduct extends Product
        testDigitalProductExtendsProduct();
        
        // Test 5: Check if DigitalProduct has downloadUrl field
        testDigitalProductHasDownloadUrl();
        
        // Test 6: Check if DigitalProduct overrides displayInfo
        testDigitalProductOverridesDisplayInfo();
        
        // Test 7: Check if Store class uses both classes
        testStoreUsesInheritance();
        
        TestFramework.printSummary();
    }
    
    /**
     * Test that Product class exists and compiles.
     */
    private static void testProductClassExists() {
        try {
            Class<?> clazz = Class.forName("Product");
            TestFramework.assertTrue(clazz != null, "Product class exists");
            TestFramework.assertTrue("Product".equals(clazz.getSimpleName()), 
                "Class name is 'Product'");
        } catch (ClassNotFoundException e) {
            TestFramework.assertTrue(false, "Product class not found - make sure it's in the correct location");
        }
    }
    
    /**
     * Test that Product has displayInfo method.
     */
    private static void testProductHasDisplayInfo() {
        try {
            Class<?> clazz = Class.forName("Product");
            java.lang.reflect.Method displayInfoMethod = clazz.getMethod("displayInfo");
            TestFramework.assertTrue(displayInfoMethod != null, "Product has displayInfo() method");
            TestFramework.assertTrue(java.lang.reflect.Modifier.isPublic(displayInfoMethod.getModifiers()), 
                "displayInfo() method is public");
            TestFramework.assertTrue(displayInfoMethod.getReturnType() == void.class, 
                "displayInfo() method returns void");
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Product displayInfo() method not found or has incorrect signature");
        }
    }
    
    /**
     * Test that DigitalProduct class exists.
     */
    private static void testDigitalProductClassExists() {
        try {
            Class<?> clazz = Class.forName("DigitalProduct");
            TestFramework.assertTrue(clazz != null, "DigitalProduct class exists");
            TestFramework.assertTrue("DigitalProduct".equals(clazz.getSimpleName()), 
                "Class name is 'DigitalProduct'");
        } catch (ClassNotFoundException e) {
            TestFramework.assertTrue(false, "DigitalProduct class not found - make sure it's in the correct location");
        }
    }
    
    /**
     * Test that DigitalProduct extends Product.
     */
    private static void testDigitalProductExtendsProduct() {
        try {
            Class<?> digitalProductClass = Class.forName("DigitalProduct");
            Class<?> productClass = Class.forName("Product");
            
            TestFramework.assertTrue(productClass.isAssignableFrom(digitalProductClass), 
                "DigitalProduct extends Product");
            TestFramework.assertTrue(digitalProductClass.getSuperclass() == productClass, 
                "DigitalProduct's superclass is Product");
        } catch (Exception e) {
            TestFramework.assertTrue(false, "DigitalProduct does not extend Product");
        }
    }
    
    /**
     * Test that DigitalProduct has downloadUrl field by checking source code.
     */
    private static void testDigitalProductHasDownloadUrl() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/DigitalProduct.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for downloadUrl field
            boolean hasDownloadUrl = content.contains("downloadUrl") || content.contains("download_url");
            TestFramework.assertTrue(hasDownloadUrl, "DigitalProduct has downloadUrl field");
            
            // Check for private field
            boolean hasPrivateDownloadUrl = content.contains("private String downloadUrl");
            TestFramework.assertTrue(hasPrivateDownloadUrl, "downloadUrl field is private");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read DigitalProduct.java source file");
        }
    }
    
    /**
     * Test that DigitalProduct overrides displayInfo method.
     */
    private static void testDigitalProductOverridesDisplayInfo() {
        try {
            Class<?> digitalProductClass = Class.forName("DigitalProduct");
            java.lang.reflect.Method displayInfoMethod = digitalProductClass.getMethod("displayInfo");
            
            TestFramework.assertTrue(displayInfoMethod != null, "DigitalProduct has displayInfo() method");
            TestFramework.assertTrue(java.lang.reflect.Modifier.isPublic(displayInfoMethod.getModifiers()), 
                "displayInfo() method is public");
            TestFramework.assertTrue(displayInfoMethod.getReturnType() == void.class, 
                "displayInfo() method returns void");
            
            // Check for @Override annotation in source code
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/DigitalProduct.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            boolean hasOverrideAnnotation = content.contains("@Override");
            TestFramework.assertTrue(hasOverrideAnnotation, "displayInfo() method has @Override annotation");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "DigitalProduct displayInfo() method not found or has incorrect signature");
        }
    }
    
    /**
     * Test that Store class uses both Product and DigitalProduct classes.
     */
    private static void testStoreUsesInheritance() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Store.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for Product usage
            boolean usesProduct = content.contains("new Product()");
            TestFramework.assertTrue(usesProduct, "Store class creates Product objects");
            
            // Check for DigitalProduct usage
            boolean usesDigitalProduct = content.contains("new DigitalProduct()");
            TestFramework.assertTrue(usesDigitalProduct, "Store class creates DigitalProduct objects");
            
            // Check for displayInfo method calls
            boolean callsDisplayInfo = content.contains(".displayInfo()");
            TestFramework.assertTrue(callsDisplayInfo, "Store class calls displayInfo() method");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Store.java source file");
        }
    }
}
