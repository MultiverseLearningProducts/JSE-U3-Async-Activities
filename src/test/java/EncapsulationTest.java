/**
 * Tests for Encapsulation implementation - 3-3 Solution
 * This test verifies that students have completed the encapsulation task correctly.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class EncapsulationTest {
    
    /**
     * Main test runner for Encapsulation tests.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Testing Encapsulation Implementation ===");
        System.out.println("This test verifies that you have completed 3-3-solution correctly.");
        System.out.println();
        
        TestFramework.reset();
        
        // Test 1: Check if Product class exists and compiles
        testProductClassExists();
        
        // Test 2: Check if fields are private
        testFieldsArePrivate();
        
        // Test 3: Check if getter methods exist
        testGetterMethodsExist();
        
        // Test 4: Check if setter methods exist
        testSetterMethodsExist();
        
        // Test 5: Check if Store class uses getter/setter methods
        testStoreUsesEncapsulation();
        
        // Test 6: Check if direct field access is prevented
        testDirectFieldAccessPrevented();
        
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
     * Test that fields are private by checking source code.
     */
    private static void testFieldsArePrivate() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Product.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for private fields
            boolean hasPrivateName = content.contains("private String name");
            TestFramework.assertTrue(hasPrivateName, "name field is private");
            
            boolean hasPrivatePrice = content.contains("private double price");
            TestFramework.assertTrue(hasPrivatePrice, "price field is private");
            
            boolean hasPrivateSku = content.contains("private String sku");
            TestFramework.assertTrue(hasPrivateSku, "sku field is private");
            
            // Check that fields are not public
            boolean hasPublicName = content.contains("public String name");
            TestFramework.assertFalse(hasPublicName, "name field is not public (should be private)");
            
            boolean hasPublicPrice = content.contains("public double price");
            TestFramework.assertFalse(hasPublicPrice, "price field is not public (should be private)");
            
            boolean hasPublicSku = content.contains("public String sku");
            TestFramework.assertFalse(hasPublicSku, "sku field is not public (should be private)");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Product.java source file");
        }
    }
    
    /**
     * Test that getter methods exist.
     */
    private static void testGetterMethodsExist() {
        try {
            Class<?> clazz = Class.forName("Product");
            
            // Check for getName method
            java.lang.reflect.Method getNameMethod = clazz.getMethod("getName");
            TestFramework.assertTrue(getNameMethod != null, "getName() method exists");
            TestFramework.assertTrue(java.lang.reflect.Modifier.isPublic(getNameMethod.getModifiers()), 
                "getName() method is public");
            TestFramework.assertTrue(getNameMethod.getReturnType() == String.class, 
                "getName() method returns String");
            
            // Check for getPrice method
            java.lang.reflect.Method getPriceMethod = clazz.getMethod("getPrice");
            TestFramework.assertTrue(getPriceMethod != null, "getPrice() method exists");
            TestFramework.assertTrue(java.lang.reflect.Modifier.isPublic(getPriceMethod.getModifiers()), 
                "getPrice() method is public");
            TestFramework.assertTrue(getPriceMethod.getReturnType() == double.class, 
                "getPrice() method returns double");
            
            // Check for getSku method
            java.lang.reflect.Method getSkuMethod = clazz.getMethod("getSku");
            TestFramework.assertTrue(getSkuMethod != null, "getSku() method exists");
            TestFramework.assertTrue(java.lang.reflect.Modifier.isPublic(getSkuMethod.getModifiers()), 
                "getSku() method is public");
            TestFramework.assertTrue(getSkuMethod.getReturnType() == String.class, 
                "getSku() method returns String");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Getter methods not found or have incorrect signatures");
        }
    }
    
    /**
     * Test that setter methods exist.
     */
    private static void testSetterMethodsExist() {
        try {
            Class<?> clazz = Class.forName("Product");
            
            // Check for setName method
            java.lang.reflect.Method setNameMethod = clazz.getMethod("setName", String.class);
            TestFramework.assertTrue(setNameMethod != null, "setName(String) method exists");
            TestFramework.assertTrue(java.lang.reflect.Modifier.isPublic(setNameMethod.getModifiers()), 
                "setName() method is public");
            TestFramework.assertTrue(setNameMethod.getReturnType() == void.class, 
                "setName() method returns void");
            
            // Check for setPrice method
            java.lang.reflect.Method setPriceMethod = clazz.getMethod("setPrice", double.class);
            TestFramework.assertTrue(setPriceMethod != null, "setPrice(double) method exists");
            TestFramework.assertTrue(java.lang.reflect.Modifier.isPublic(setPriceMethod.getModifiers()), 
                "setPrice() method is public");
            TestFramework.assertTrue(setPriceMethod.getReturnType() == void.class, 
                "setPrice() method returns void");
            
            // Check for setSku method
            java.lang.reflect.Method setSkuMethod = clazz.getMethod("setSku", String.class);
            TestFramework.assertTrue(setSkuMethod != null, "setSku(String) method exists");
            TestFramework.assertTrue(java.lang.reflect.Modifier.isPublic(setSkuMethod.getModifiers()), 
                "setSku() method is public");
            TestFramework.assertTrue(setSkuMethod.getReturnType() == void.class, 
                "setSku() method returns void");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Setter methods not found or have incorrect signatures");
        }
    }
    
    /**
     * Test that Store class uses getter/setter methods by checking source code.
     */
    private static void testStoreUsesEncapsulation() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Store.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for getter method usage
            boolean usesGetters = content.contains(".getName()") || content.contains(".getPrice()") || content.contains(".getSku()");
            TestFramework.assertTrue(usesGetters, "Store class uses getter methods");
            
            // Check for setter method usage
            boolean usesSetters = content.contains(".setName(") || content.contains(".setPrice(") || content.contains(".setSku(");
            TestFramework.assertTrue(usesSetters, "Store class uses setter methods");
            
            // Check that direct field access is not used
            boolean usesDirectAccess = content.contains(".name =") || content.contains(".price =") || content.contains(".sku =");
            TestFramework.assertFalse(usesDirectAccess, "Store class does not use direct field access (should use getters/setters)");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Store.java source file");
        }
    }
    
    /**
     * Test that direct field access is prevented by attempting to access private fields.
     */
    private static void testDirectFieldAccessPrevented() {
        try {
            Class<?> clazz = Class.forName("Product");
            Object product = clazz.newInstance();
            
            // Try to access private fields directly (this should fail)
            try {
                java.lang.reflect.Field nameField = clazz.getDeclaredField("name");
                nameField.setAccessible(false); // Ensure it's not accessible
                nameField.get(product);
                TestFramework.assertTrue(false, "Direct field access should be prevented");
            } catch (IllegalAccessException e) {
                TestFramework.assertTrue(true, "Direct field access is properly prevented");
            }
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not test field access: " + e.getMessage());
        }
    }
}
