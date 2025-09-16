/**
 * Test runner for 3-2-starter branch.
 * This runs all tests to verify 3-2-solution completion.
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
        System.out.println("=== 3-2 Starter Test Suite ===");
        System.out.println("Testing if 3-2-solution (Product class blueprint) has been completed correctly.");
        System.out.println();
        
        // Run Product tests
        ProductTest.main(args);
        
        System.out.println("\n=== Instructions ===");
        System.out.println("If all tests pass, you have successfully completed 3-2-solution!");
        System.out.println("If tests fail, please review the requirements:");
        System.out.println("1. Create a Product class with three public fields: String name, double price, String sku");
        System.out.println("2. Create a Store class with a main method");
        System.out.println("3. In main, create two different Product objects");
        System.out.println("4. Set the field values for each product manually");
        System.out.println("5. Print the product information to the console");
    }
}
