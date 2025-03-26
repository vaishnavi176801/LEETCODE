class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int count=0;
        Set<Character> hs = new HashSet<>();
        for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                   if(hs.add(s.charAt(j))){
                      hs.add(s.charAt(j));
                       if(count<hs.size())
                        count=hs.size();
                    }
                    else{
                    
                        hs.clear();
                        break;
                    }
                }
        }
        return count;
    }
}