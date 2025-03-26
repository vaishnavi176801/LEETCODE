class Solution {
    public boolean isPalindrome(int x) {
       char[] arr=String.valueOf(x).toCharArray();
       int count=0;
       int n = arr.length;
         for (int i = 0; i < n / 2; i++) {
            if (arr[i] == arr[n - i - 1]) {
                count++;
            } else {
                break;
            }
        }

       
       if (count == arr.length/2)
       {
           return true;

       }
       else{
           return false;
       }
    }
}
