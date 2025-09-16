/**
 * Test runner for 3-2-solution branch.
 * This runs all tests to verify 3-3-solution completion.
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
        System.out.println("=== 3-2 Solution Test Suite ===");
        System.out.println("Testing if 3-3-solution (Encapsulation) has been completed correctly.");
        System.out.println();
        
        // Run Encapsulation tests
        EncapsulationTest.main(args);
        
        System.out.println("\n=== Instructions ===");
        System.out.println("If all tests pass, you have successfully completed 3-3-solution!");
        System.out.println("If tests fail, please review the requirements:");
        System.out.println("1. Change Product fields from public to private");
        System.out.println("2. Create public getter methods (getName, getPrice, getSku)");
        System.out.println("3. Create public setter methods (setName, setPrice, setSku)");
        System.out.println("4. Update Store.java to use getter/setter methods instead of direct field access");
        System.out.println("5. Ensure the code compiles and runs without errors");
    }
}
