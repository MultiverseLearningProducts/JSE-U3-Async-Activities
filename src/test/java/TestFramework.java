/**
 * Simple test framework for Java learning exercises.
 * This provides basic assertion methods for testing student solutions.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class TestFramework {
    
    private static int testsPassed = 0;
    private static int testsFailed = 0;
    private static int totalTests = 0;
    
    /**
     * Assert that two objects are equal.
     * 
     * @param expected the expected value
     * @param actual the actual value
     * @param message the test message
     */
    public static void assertEqual(Object expected, Object actual, String message) {
        totalTests++;
        if (expected == null && actual == null) {
            testsPassed++;
            System.out.println("✓ PASS: " + message);
        } else if (expected != null && expected.equals(actual)) {
            testsPassed++;
            System.out.println("✓ PASS: " + message);
        } else {
            testsFailed++;
            System.out.println("✗ FAIL: " + message);
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + actual);
        }
    }
    
    /**
     * Assert that a condition is true.
     * 
     * @param condition the condition to test
     * @param message the test message
     */
    public static void assertTrue(boolean condition, String message) {
        totalTests++;
        if (condition) {
            testsPassed++;
            System.out.println("✓ PASS: " + message);
        } else {
            testsFailed++;
            System.out.println("✗ FAIL: " + message);
        }
    }
    
    /**
     * Assert that a condition is false.
     * 
     * @param condition the condition to test
     * @param message the test message
     */
    public static void assertFalse(boolean condition, String message) {
        totalTests++;
        if (!condition) {
            testsPassed++;
            System.out.println("✗ FAIL: " + message);
        } else {
            testsPassed++;
            System.out.println("✓ PASS: " + message);
        }
    }
    
    /**
     * Print the test summary.
     */
    public static void printSummary() {
        System.out.println("\n=== TEST SUMMARY ===");
        System.out.println("Total Tests: " + totalTests);
        System.out.println("Passed: " + testsPassed);
        System.out.println("Failed: " + testsFailed);
        
        if (testsFailed == 0) {
            System.out.println("🎉 ALL TESTS PASSED! Great job!");
        } else {
            System.out.println("❌ Some tests failed. Please review your implementation.");
        }
    }
    
    /**
     * Reset the test counters.
     */
    public static void reset() {
        testsPassed = 0;
        testsFailed = 0;
        totalTests = 0;
    }
}
