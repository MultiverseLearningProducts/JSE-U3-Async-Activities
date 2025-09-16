/**
 * Test runner for 3-5-solution branch.
 * This runs all tests to verify 3-6-solution completion.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class TestRunner {
    
    /**
     * Main method to run all tests.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== 3-5 Solution Test Suite ===");
        System.out.println("Testing if 3-6-solution (Flexible Shopping Cart) has been completed correctly.");
        System.out.println();
        
        // Run Shopping Cart tests
        ShoppingCartTest.main(args);
        
        System.out.println("\n=== Instructions ===");
        System.out.println("If all tests pass, you have successfully completed 3-6-solution!");
        System.out.println("If tests fail, please review the requirements:");
        System.out.println("1. Create an ArrayList<Product> shoppingCart in Store.java");
        System.out.println("2. Add both Product and DigitalProduct objects to the ArrayList");
        System.out.println("3. Use a for-each loop to iterate through the shoppingCart");
        System.out.println("4. Call displayInfo() method on each item in the loop");
        System.out.println("5. Import java.util.ArrayList at the top of Store.java");
        System.out.println("6. Demonstrate the power of polymorphic collections");
    }
}
