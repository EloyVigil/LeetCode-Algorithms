import java.util.HashMap;

public class RomanToInteger {
    private static final HashMap<Character, Integer> ROMAN_NUMERAL_MAP = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public static int convert(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = ROMAN_NUMERAL_MAP.get(s.charAt(i));
            int next = (i < s.length() - 1) ? ROMAN_NUMERAL_MAP.get(s.charAt(i + 1)) : 0;
            if (current < next) {
                num -= current;
            } else {
                num += current;
            }
        }
        return num;
    }
    
    
    public static void main(String[] args) {
        testConvert();
    }
    
    private static void testConvert() {
        assert RomanToInteger.convert("III") == 3 : "Test Case 1 Failed";
        assert RomanToInteger.convert("LVIII") == 58 : "Test Case 2 Failed";
        assert RomanToInteger.convert("MCMXCIV") == 1994 : "Test Case 3 Failed";
        System.out.println("All test cases passed");
    }
    
}
