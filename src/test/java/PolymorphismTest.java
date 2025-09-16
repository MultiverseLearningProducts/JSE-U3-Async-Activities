/**
 * Tests for Polymorphism implementation - 3-5 Solution
 * This test verifies that students have completed the polymorphism task correctly.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class PolymorphismTest {
    
    /**
     * Main test runner for Polymorphism tests.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Testing Polymorphism Implementation ===");
        System.out.println("This test verifies that you have completed 3-5-solution correctly.");
        System.out.println();
        
        TestFramework.reset();
        
        // Test 1: Check if Product and DigitalProduct classes exist
        testClassesExist();
        
        // Test 2: Check if Store class uses parent references
        testStoreUsesParentReferences();
        
        // Test 3: Check if Store demonstrates polymorphism
        testStoreDemonstratesPolymorphism();
        
        // Test 4: Check if Store creates both object types
        testStoreCreatesBothTypes();
        
        // Test 5: Check if Store calls displayInfo polymorphically
        testStoreCallsDisplayInfoPolymorphically();
        
        TestFramework.printSummary();
    }
    
    /**
     * Test that Product and DigitalProduct classes exist.
     */
    private static void testClassesExist() {
        try {
            Class<?> productClass = Class.forName("Product");
            Class<?> digitalProductClass = Class.forName("DigitalProduct");
            
            TestFramework.assertTrue(productClass != null, "Product class exists");
            TestFramework.assertTrue(digitalProductClass != null, "DigitalProduct class exists");
            TestFramework.assertTrue(digitalProductClass.getSuperclass() == productClass, 
                "DigitalProduct extends Product");
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Required classes not found: " + e.getMessage());
        }
    }
    
    /**
     * Test that Store class uses parent references by checking source code.
     */
    private static void testStoreUsesParentReferences() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Store.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for parent reference variable
            boolean hasParentReference = content.contains("Product currentProduct") || 
                                       content.contains("Product ") && content.contains("currentProduct");
            TestFramework.assertTrue(hasParentReference, "Store class uses parent reference variable");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Store.java source file");
        }
    }
    
    /**
     * Test that Store demonstrates polymorphism by checking source code.
     */
    private static void testStoreDemonstratesPolymorphism() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Store.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for assignment to parent reference
            boolean assignsToParent = content.contains("currentProduct =") || 
                                    content.contains("= standardProduct") || 
                                    content.contains("= digitalProduct");
            TestFramework.assertTrue(assignsToParent, "Store class assigns objects to parent reference");
            
            // Check for polymorphic method calls
            boolean callsDisplayInfo = content.contains("currentProduct.displayInfo()");
            TestFramework.assertTrue(callsDisplayInfo, "Store class calls displayInfo() on parent reference");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Store.java source file");
        }
    }
    
    /**
     * Test that Store creates both Product and DigitalProduct objects.
     */
    private static void testStoreCreatesBothTypes() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Store.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for Product object creation
            boolean createsProduct = content.contains("new Product()");
            TestFramework.assertTrue(createsProduct, "Store class creates Product objects");
            
            // Check for DigitalProduct object creation
            boolean createsDigitalProduct = content.contains("new DigitalProduct()");
            TestFramework.assertTrue(createsDigitalProduct, "Store class creates DigitalProduct objects");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Store.java source file");
        }
    }
    
    /**
     * Test that Store calls displayInfo polymorphically by checking source code.
     */
    private static void testStoreCallsDisplayInfoPolymorphically() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Store.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for multiple displayInfo calls on the same reference
            int displayInfoCount = 0;
            String[] lines = content.split("\n");
            for (String line : lines) {
                if (line.contains("currentProduct.displayInfo()")) {
                    displayInfoCount++;
                }
            }
            
            TestFramework.assertTrue(displayInfoCount >= 2, 
                "Store class calls displayInfo() multiple times on parent reference (polymorphism)");
            
            // Check for comments explaining polymorphism
            boolean explainsPolymorphism = content.contains("polymorphism") || 
                                         content.contains("same method call") || 
                                         content.contains("different output");
            TestFramework.assertTrue(explainsPolymorphism, 
                "Store class includes explanation of polymorphism");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Store.java source file");
        }
    }
}
