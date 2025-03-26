class Solution {
    public int reverse(int x) {
        long num=x;
        int n=0;
        long ans=0;
        while(x!=0){
           x=x/10;
           n++;
        }
        if(num>0){
        for(int i=n-1;i>=0;i--){
          ans+=(num%10)*Math.pow(10,i);
          num=num/10;
        } 
        }
        else{
            num=num*-1;
         for(int i=n-1;i>=0;i--){
          ans+=(num%10)*Math.pow(10,i);
          num=num/10;
        } 
        ans=-1*ans;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)return 0;
        return (int)ans;
    }
}