public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = (i >= 0 ? Character.getNumericValue(a.charAt(i)) : 0)
                    + (j >= 0 ? Character.getNumericValue(b.charAt(j)) : 0)
                    + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }

        if (carry != 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    public static void testAddBinary() {
        
        String[][] testCases = {
            {"11", "1"},
            {"1010", "1011"},
            {"0", "0"},
            {"111", "111"},
            {"10", "101"}
        };

        String[] expectedResults = {
            "100",
            "10101",
            "0",
            "1110",
            "111"
        };

        for (int i = 0; i < testCases.length; i++) {
            String[] input = testCases[i];
            String expected = expectedResults[i];
            String result = addBinary(input[0], input[1]);

            if (result.equals(expected)) {
                System.out.println("Test case " + (i + 1) + " passed!");
            } else {
                System.out.println("Test case " + (i + 1) + " failed. Expected '" + expected
                        + "', but got '" + result + "'.");
            }
        }
    }

    public static void main(String[] args) {
        testAddBinary();
    }
}
