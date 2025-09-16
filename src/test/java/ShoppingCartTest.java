/**
 * Tests for Flexible Shopping Cart implementation - 3-6 Solution
 * This test verifies that students have completed the flexible shopping cart task correctly.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class ShoppingCartTest {
    
    /**
     * Main test runner for Shopping Cart tests.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Testing Flexible Shopping Cart Implementation ===");
        System.out.println("This test verifies that you have completed 3-6-solution correctly.");
        System.out.println();
        
        TestFramework.reset();
        
        // Test 1: Check if Store class exists and compiles
        testStoreClassExists();
        
        // Test 2: Check if Store uses ArrayList
        testStoreUsesArrayList();
        
        // Test 3: Check if Store declares ArrayList<Product>
        testStoreDeclaresArrayListProduct();
        
        // Test 4: Check if Store adds both Product and DigitalProduct to ArrayList
        testStoreAddsBothTypesToArrayList();
        
        // Test 5: Check if Store uses for-each loop
        testStoreUsesForEachLoop();
        
        // Test 6: Check if Store calls displayInfo on ArrayList items
        testStoreCallsDisplayInfoOnArrayListItems();
        
        TestFramework.printSummary();
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
     * Test that Store uses ArrayList by checking source code.
     */
    private static void testStoreUsesArrayList() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Store.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for ArrayList usage
            boolean usesArrayList = content.contains("ArrayList") || content.contains("ArrayList<");
            TestFramework.assertTrue(usesArrayList, "Store class uses ArrayList");
            
            // Check for import statement
            boolean importsArrayList = content.contains("import java.util.ArrayList") || 
                                     content.contains("import java.util.*");
            TestFramework.assertTrue(importsArrayList, "Store class imports ArrayList");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Store.java source file");
        }
    }
    
    /**
     * Test that Store declares ArrayList<Product> by checking source code.
     */
    private static void testStoreDeclaresArrayListProduct() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Store.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for ArrayList<Product> declaration
            boolean declaresArrayListProduct = content.contains("ArrayList<Product>") || 
                                             content.contains("ArrayList< Product >");
            TestFramework.assertTrue(declaresArrayListProduct, "Store class declares ArrayList<Product>");
            
            // Check for shoppingCart variable name
            boolean hasShoppingCartVariable = content.contains("shoppingCart") || 
                                             content.contains("cart") || 
                                             content.contains("products");
            TestFramework.assertTrue(hasShoppingCartVariable, "Store class has shopping cart variable");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Store.java source file");
        }
    }
    
    /**
     * Test that Store adds both Product and DigitalProduct to ArrayList by checking source code.
     */
    private static void testStoreAddsBothTypesToArrayList() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Store.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for add method calls
            boolean usesAddMethod = content.contains(".add(");
            TestFramework.assertTrue(usesAddMethod, "Store class uses add() method on ArrayList");
            
            // Check for multiple add calls (indicating multiple items)
            int addCount = 0;
            String[] lines = content.split("\n");
            for (String line : lines) {
                if (line.contains(".add(")) {
                    addCount++;
                }
            }
            TestFramework.assertTrue(addCount >= 2, "Store class adds multiple items to ArrayList");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Store.java source file");
        }
    }
    
    /**
     * Test that Store uses for-each loop by checking source code.
     */
    private static void testStoreUsesForEachLoop() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Store.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for for-each loop syntax
            boolean usesForEach = content.contains("for (") && content.contains(":") && content.contains(")");
            TestFramework.assertTrue(usesForEach, "Store class uses for-each loop");
            
            // Check for Product type in for-each loop
            boolean usesProductInForEach = content.contains("for (Product ") || 
                                         content.contains("for ( Product ");
            TestFramework.assertTrue(usesProductInForEach, "Store class uses Product type in for-each loop");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Store.java source file");
        }
    }
    
    /**
     * Test that Store calls displayInfo on ArrayList items by checking source code.
     */
    private static void testStoreCallsDisplayInfoOnArrayListItems() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Store.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for displayInfo method calls
            boolean callsDisplayInfo = content.contains(".displayInfo()");
            TestFramework.assertTrue(callsDisplayInfo, "Store class calls displayInfo() method");
            
            // Check for displayInfo calls within for-each loop context
            String[] lines = content.split("\n");
            boolean displayInfoInLoop = false;
            boolean inForEachLoop = false;
            
            for (String line : lines) {
                if (line.contains("for (") && line.contains(":")) {
                    inForEachLoop = true;
                } else if (inForEachLoop && line.contains("}")) {
                    inForEachLoop = false;
                } else if (inForEachLoop && line.contains(".displayInfo()")) {
                    displayInfoInLoop = true;
                }
            }
            
            TestFramework.assertTrue(displayInfoInLoop, "Store class calls displayInfo() within for-each loop");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Store.java source file");
        }
    }
}
