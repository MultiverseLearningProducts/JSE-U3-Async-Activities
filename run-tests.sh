#!/bin/bash

# Bash script to run Java tests and return structured results
# This script compiles and runs the Java test suite, then parses the output

TEST_CLASS=${1:-"TestRunner"}
BRANCH_NAME=${2:-"3-2-solution"}

echo "Running tests for branch: $BRANCH_NAME"
echo "Test class: $TEST_CLASS"
echo "=================================================="

# Function to create JSON-like output
create_test_result() {
    local all_tests_passed=$1
    local total_tests=$2
    local passed_tests=$3
    local failed_tests=$4
    local failed_test_names=$5
    local error_message=$6
    
    echo "{"
    echo "  \"BranchName\": \"$BRANCH_NAME\","
    echo "  \"AllTestsPassed\": $all_tests_passed,"
    echo "  \"TotalTests\": $total_tests,"
    echo "  \"PassedTests\": $passed_tests,"
    echo "  \"FailedTests\": $failed_tests,"
    echo "  \"FailedTestNames\": [$failed_test_names],"
    echo "  \"ErrorMessage\": \"$error_message\","
    echo "  \"Timestamp\": \"$(date '+%Y-%m-%d %H:%M:%S')\""
    echo "}"
}

# Check if test files exist
if [ ! -d "src/test/java" ] || [ -z "$(find src/test/java -name '*.java' -type f)" ]; then
    create_test_result false 0 0 0 "[]" "No test files found"
    exit 1
fi

# Compile Java files
echo "Compiling Java files..."

# Check if main source files exist
if [ -d "src/main/java" ] && [ -n "$(find src/main/java -name '*.java' -type f)" ]; then
    javac -cp "src/main/java:src/test/java" src/main/java/*.java src/test/java/*.java 2>&1
    CLASSPATH="src/main/java:src/test/java"
else
    javac -cp "src/test/java" src/test/java/*.java 2>&1
    CLASSPATH="src/test/java"
fi

if [ $? -ne 0 ]; then
    create_test_result false 0 0 0 "[]" "Compilation failed"
    exit 1
fi

# Run the test class
echo "Running tests..."
TEST_OUTPUT=$(java -cp "$CLASSPATH" "$TEST_CLASS" 2>&1)

# Parse the test output
TOTAL_TESTS=0
PASSED_TESTS=0
FAILED_TESTS=0
FAILED_TEST_NAMES=""

# Extract numbers from test summary using grep -o
TOTAL_TESTS=$(echo "$TEST_OUTPUT" | grep "Total Tests:" | grep -o '[0-9]\+' | head -1)
PASSED_TESTS=$(echo "$TEST_OUTPUT" | grep "Passed:" | grep -o '[0-9]\+' | head -1)
FAILED_TESTS=$(echo "$TEST_OUTPUT" | grep "Failed:" | grep -o '[0-9]\+' | head -1)

# Handle cases where parsing might fail
if [ -z "$TOTAL_TESTS" ] || ! [[ "$TOTAL_TESTS" =~ ^[0-9]+$ ]]; then
    TOTAL_TESTS=0
fi
if [ -z "$PASSED_TESTS" ] || ! [[ "$PASSED_TESTS" =~ ^[0-9]+$ ]]; then
    PASSED_TESTS=0
fi
if [ -z "$FAILED_TESTS" ] || ! [[ "$FAILED_TESTS" =~ ^[0-9]+$ ]]; then
    FAILED_TESTS=0
fi

# Extract failed test names
FAILED_TEST_NAMES=$(echo "$TEST_OUTPUT" | grep "✗ FAIL:" | sed 's/.*✗ FAIL: \(.*\)/\1/' | sed 's/^/"/' | sed 's/$/"/' | tr '\n' ',' | sed 's/,$//')
if [ -z "$FAILED_TEST_NAMES" ]; then
    FAILED_TEST_NAMES=""
else
    FAILED_TEST_NAMES="[$FAILED_TEST_NAMES]"
fi

# Determine if all tests passed
if [ "$FAILED_TESTS" -eq 0 ] && [ "$TOTAL_TESTS" -gt 0 ]; then
    ALL_TESTS_PASSED=true
else
    ALL_TESTS_PASSED=false
fi

# Display results
echo ""
echo "Test Results:"
echo "Total Tests: $TOTAL_TESTS"
echo "Passed: $PASSED_TESTS"
echo "Failed: $FAILED_TESTS"

if [ "$ALL_TESTS_PASSED" = true ]; then
    echo "🎉 ALL TESTS PASSED!"
else
    echo "❌ Some tests failed"
    if [ -n "$FAILED_TEST_NAMES" ] && [ "$FAILED_TEST_NAMES" != "[]" ]; then
        echo "Failed tests:"
        echo "$TEST_OUTPUT" | grep "✗ FAIL:" | sed 's/.*✗ FAIL: /  - /'
    fi
fi

# Return the result
create_test_result "$ALL_TESTS_PASSED" "$TOTAL_TESTS" "$PASSED_TESTS" "$FAILED_TESTS" "$FAILED_TEST_NAMES" ""
