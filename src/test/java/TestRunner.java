/**
 * Test runner for 3-6-solution branch.
 * This runs the final test to celebrate completion of Unit 3 OOP journey.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class TestRunner {
    
    /**
     * Main method to run the final test.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Unit 3 OOP Journey - Final Test ===");
        System.out.println("This is the final test for the complete Unit 3 OOP implementation.");
        System.out.println();
        
        // Run Final test
        FinalTest.main(args);
        
        System.out.println("\n=== How to Run Your Solutions ===");
        System.out.println("To test any of your solutions, run:");
        System.out.println("javac src/main/java/*.java");
        System.out.println("java -cp src/main/java Store");
        System.out.println();
        System.out.println("To run individual tests, use:");
        System.out.println("javac src/test/java/*.java");
        System.out.println("java -cp src/test/java TestRunner");
    }
}
