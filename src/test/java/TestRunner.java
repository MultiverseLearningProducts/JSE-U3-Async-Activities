/**
 * Test runner for 3-4-solution branch.
 * This runs all tests to verify 3-5-solution completion.
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
        System.out.println("=== 3-4 Solution Test Suite ===");
        System.out.println("Testing if 3-5-solution (Polymorphism) has been completed correctly.");
        System.out.println();
        
        // Run Polymorphism tests
        PolymorphismTest.main(args);
        
        System.out.println("\n=== Instructions ===");
        System.out.println("If all tests pass, you have successfully completed 3-5-solution!");
        System.out.println("If tests fail, please review the requirements:");
        System.out.println("1. Create a Product currentProduct variable in Store.java");
        System.out.println("2. Assign a Product object to currentProduct and call displayInfo()");
        System.out.println("3. Assign a DigitalProduct object to currentProduct and call displayInfo() again");
        System.out.println("4. Notice that the same method call produces different output");
        System.out.println("5. Add comments explaining the polymorphic behavior");
        System.out.println("6. Ensure both object types are created and used");
    }
}
