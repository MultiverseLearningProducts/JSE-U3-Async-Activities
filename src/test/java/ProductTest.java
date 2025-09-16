/**
 * Tests for Product class - 3-2 Solution
 * This test verifies that students have completed the Product class blueprint task correctly.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class ProductTest {
    
    /**
     * Main test runner for Product tests.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Testing Product Class Implementation ===");
        System.out.println("This test verifies that you have completed 3-2-solution correctly.");
        System.out.println();
        
        TestFramework.reset();
        
        // Test 1: Check if Product class exists and can be instantiated
        testClassExists();
        
        // Test 2: Check if required public fields exist
        testPublicFieldsExist();
        
        // Test 3: Check if the class compiles without errors
        testClassCompiles();
        
        // Test 4: Check if fields can be accessed directly
        testFieldAccess();
        
        // Test 5: Check if Store class exists and compiles
        testStoreClassExists();
        
        // Test 6: Check if Store class creates Product objects
        testStoreCreatesProducts();
        
        TestFramework.printSummary();
    }
    
    /**
     * Test that Product class exists and can be instantiated.
     */
    private static void testClassExists() {
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
     * Test that required public fields exist by checking source code.
     */
    private static void testPublicFieldsExist() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Product.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for public String name field
            boolean hasNameField = content.contains("public String name");
            TestFramework.assertTrue(hasNameField, "public String name field is declared");
            
            // Check for public double price field
            boolean hasPriceField = content.contains("public double price");
            TestFramework.assertTrue(hasPriceField, "public double price field is declared");
            
            // Check for public String sku field
            boolean hasSkuField = content.contains("public String sku");
            TestFramework.assertTrue(hasSkuField, "public String sku field is declared");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Product.java source file");
        }
    }
    
    /**
     * Test that the class compiles without errors.
     */
    private static void testClassCompiles() {
        try {
            // Try to compile the Product class
            ProcessBuilder pb = new ProcessBuilder("javac", "src/main/java/Product.java");
            Process process = pb.start();
            int exitCode = process.waitFor();
            
            TestFramework.assertTrue(exitCode == 0, "Product class compiles without errors");
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Failed to compile Product class: " + e.getMessage());
        }
    }
    
    /**
     * Test that fields can be accessed directly by creating an instance.
     */
    private static void testFieldAccess() {
        try {
            Class<?> clazz = Class.forName("Product");
            Object product = clazz.newInstance();
            
            // Test that we can access the fields directly
            java.lang.reflect.Field nameField = clazz.getField("name");
            java.lang.reflect.Field priceField = clazz.getField("price");
            java.lang.reflect.Field skuField = clazz.getField("sku");
            
            TestFramework.assertTrue(nameField != null, "name field is accessible");
            TestFramework.assertTrue(priceField != null, "price field is accessible");
            TestFramework.assertTrue(skuField != null, "sku field is accessible");
            
            // Test that fields are public
            TestFramework.assertTrue(java.lang.reflect.Modifier.isPublic(nameField.getModifiers()), 
                "name field is public");
            TestFramework.assertTrue(java.lang.reflect.Modifier.isPublic(priceField.getModifiers()), 
                "price field is public");
            TestFramework.assertTrue(java.lang.reflect.Modifier.isPublic(skuField.getModifiers()), 
                "sku field is public");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not access Product fields: " + e.getMessage());
        }
    }
    
    /**
     * Test that Store class exists and compiles.
     */
    private static void testStoreClassExists() {
        try {
            Class<?> clazz = Class.forName("Store");
            TestFramework.assertTrue(clazz != null, "Store class exists");
            TestFramework.assertTrue("Store".equals(clazz.getSimpleName()), 
                "Class name is 'Store'");
        } catch (ClassNotFoundException e) {
            TestFramework.assertTrue(false, "Store class not found - make sure it's in the correct location");
        }
    }
    
    /**
     * Test that Store class creates Product objects by checking source code.
     */
    private static void testStoreCreatesProducts() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Store.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for Product object creation
            boolean createsProducts = content.contains("new Product()");
            TestFramework.assertTrue(createsProducts, "Store class creates Product objects");
            
            // Check for field assignment
            boolean assignsFields = content.contains(".name =") && content.contains(".price =") && content.contains(".sku =");
            TestFramework.assertTrue(assignsFields, "Store class assigns values to Product fields");
            
            // Check for System.out.println usage
            boolean printsInfo = content.contains("System.out.println");
            TestFramework.assertTrue(printsInfo, "Store class prints product information");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Store.java source file");
        }
    }
}
