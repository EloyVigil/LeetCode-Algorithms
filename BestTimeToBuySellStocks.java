import java.util.ArrayList;
import java.util.List;

public class BestTimeToBuySellStocks {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (price - buy > maxProfit) {
                maxProfit = price - buy;
            }
            if (price < buy) {
                buy = price;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        testMaxProfit();
    }

    public static void testMaxProfit() {
        List<TestCase> testCases = new ArrayList<>();
        testCases.add(new TestCase(new int[]{7, 1, 5, 3, 6, 4}, 5));
        testCases.add(new TestCase(new int[]{7, 6, 4, 3, 1}, 0));
        testCases.add(new TestCase(new int[]{3, 2, 6, 5, 0, 3}, 4));

        for (int i = 0; i < testCases.size(); i++) {
            TestCase testCase = testCases.get(i);
            int result = maxProfit(testCase.input);
            if (result == testCase.expected) {
                System.out.println("Test Case " + (i + 1) + ": Passed");
            } else {
                System.out.println("Test Case " + (i + 1) + ": Failed");
                System.out.println("  Expected: " + testCase.expected);
                System.out.println("  Received: " + result);
            }
        }
    }

    static class TestCase {
        int[] input;
        int expected;

        TestCase(int[] input, int expected) {
            this.input = input;
            this.expected = expected;
        }
    }
}

