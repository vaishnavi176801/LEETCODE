class Solution {
    public int compress(char[] chars) {
        char s = '{'; 
        List<Character> ans = new ArrayList<>(); 
        int n = chars.length;
        int times = 0; 

        for (int i = 0; i < n; i++) {
            if (chars[i] != s) {
                if (times > 0) {
                    if (times > 1) {
                        String timesStr = Integer.toString(times);
                        for (char c : timesStr.toCharArray()) {
                            ans.add(c);
                        }
                    }
                }
                s = chars[i];
                ans.add(s);
                times = 1;
            } else {
                times++;
            }
        }

        if (times > 0) {
            if (times > 1) {
                String timesStr = Integer.toString(times);
                for (char c : timesStr.toCharArray()) {
                    ans.add(c);
                }
            }
        }


        for (int i = 0; i < ans.size(); i++) {
            chars[i] = ans.get(i);
        }

        return ans.size(); 
    }
}
