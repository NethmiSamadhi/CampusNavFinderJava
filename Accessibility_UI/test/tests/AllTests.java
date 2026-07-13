package tests;

import testutil.TestRunner;

/**
 * Runs all test classes. Compile and run with:
 *   javac -d out $(find src test -name "*.java")
 *   java -cp out tests.AllTests
 */
public class AllTests {
    public static void main(String[] args) {
        TestGraph.run();
        TestDijkstra.run();
        TestCongestion.run();
        TestMultiStopOptimizer.run();
        TestAccessibilityFilter.run();

        TestRunner.printSummary();

        if (TestRunner.hasFailures()) {
            System.exit(1);
        }
    }
}
