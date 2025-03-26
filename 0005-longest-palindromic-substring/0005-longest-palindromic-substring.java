class Solution {
    public String longestPalindrome(String s) {
           char[] arr=s.toCharArray();
         int count=0;
         
         int sT=0;
         int eD=0;
          int n = arr.length;
         for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++){
                int TempCount=0;
                for(int k=0;k<=(j-i)/2;k++){
                    if(arr[i+k]==arr[j-k]){
                        TempCount=j-i+1;
                    }
                    else{
                        TempCount=0;
                        break;
                    }
                }
                 if(TempCount>count){
                    count=TempCount;
                    sT=i;
                    eD=j;
                  }
            }

         }
         String m="";
         for(int i=sT;i<=eD;i++){
            m+=arr[i];
         }

        return m;
    }
}