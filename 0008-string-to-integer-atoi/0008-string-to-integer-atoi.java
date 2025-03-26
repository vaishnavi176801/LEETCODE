class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Step 1: Trim leading spaces
        s = s.trim();
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        // Step 2: Handle optional sign
        int i = 0;
        int negative = 1;
        if (s.charAt(i) == '-') {
            negative = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // Step 3: Convert characters to integer
        int result = 0;
        while (i < n) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                break;
            }

            // Check for overflow and underflow before multiplying result by 10
            int digit = c - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return negative == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * negative;
    }
}
