public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) { // If 'needle' is an empty string, return -1
            return -1;
        }
        // Iterate over each character in 'haystack' until the last character of 'needle' can fit in the remaining length of 'haystack'
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String str = ""; // Initialize an empty string 'str' for each iteration
            // Iterate over each character in the substring of 'haystack' starting from the ith index and with a length equal to the length of 'needle'
            for (int j = i; j < i + needle.length(); j++) {
                str += haystack.charAt(j); // Append each character to the 'str' string
            }
            if (str.equals(needle)) { // If the 'str' string matches 'needle'
                return i; // Return the index at which the substring containing 'needle' starts in 'haystack'
            }
        }
        return -1; // If 'needle' is not found in 'haystack', return -1
    }

    public static void main(String[] args) {
        // Test Case 1
        String haystack1 = "hello";
        String needle1 = "ll";
        int expected1 = 2;
        int result1 = strStr(haystack1, needle1);
        System.out.println(result1 == expected1 ? "PASS" : "FAIL");

        // Test Case 2
        String haystack2 = "aaaaa";
        String needle2 = "bba";
        int expected2 = -1;
        int result2 = strStr(haystack2, needle2);
        System.out.println(result2 == expected2 ? "PASS" : "FAIL");

        // Test Case 3
        String haystack3 = "";
        String needle3 = "";
        int expected3 = 0;
        int result3 = strStr(haystack3, needle3);
        System.out.println(result3 == expected3 ? "PASS" : "FAIL");
    }
}