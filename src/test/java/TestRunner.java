/**
 * Test runner for 3-3-solution branch.
 * This runs all tests to verify 3-4-solution completion.
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
        System.out.println("=== 3-3 Solution Test Suite ===");
        System.out.println("Testing if 3-4-solution (Inheritance) has been completed correctly.");
        System.out.println();
        
        // Run Inheritance tests
        InheritanceTest.main(args);
        
        System.out.println("\n=== Instructions ===");
        System.out.println("If all tests pass, you have successfully completed 3-4-solution!");
        System.out.println("If tests fail, please review the requirements:");
        System.out.println("1. Create a DigitalProduct class that extends Product");
        System.out.println("2. Add a private String downloadUrl field to DigitalProduct");
        System.out.println("3. Create a displayInfo() method in Product class");
        System.out.println("4. Override displayInfo() in DigitalProduct to include download URL");
        System.out.println("5. Update Store.java to create and use both Product and DigitalProduct objects");
        System.out.println("6. Use @Override annotation for the overridden method");
    }
}
