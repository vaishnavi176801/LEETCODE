class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                count += 1;
            } else if (s.charAt(i) == 'V') {
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    count += 3;
                } else {
                    count += 5;
                }
            } else if (s.charAt(i) == 'X') {
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    count += 8;
                } else {
                    count += 10;
                }
            } else if (s.charAt(i) == 'L') {
                if (i > 0 && s.charAt(i - 1) == 'X') {
                    count += 30;
                } else {
                    count += 50;
                }
            } else if (s.charAt(i) == 'C') {
                if (i > 0 && s.charAt(i - 1) == 'X') {
                    count += 80;
                } else {
                    count += 100;
                }
            } else if (s.charAt(i) == 'D') {
                if (i > 0 && s.charAt(i - 1) == 'C') {
                    count += 300;
                } else {
                    count += 500;
                }
            } else if (s.charAt(i) == 'M') {
                if (i > 0 && s.charAt(i - 1) == 'C') {
                    count += 800;
                } else {
                    count += 1000;
                }
            }
        }

        return count;
    }
}
