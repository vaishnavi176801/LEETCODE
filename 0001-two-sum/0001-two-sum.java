
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int n= nums.length;
        for(int i=0;i<n;i++){
            int m = nums[i];
            for(int j=0;j<n;j++){
                if(i!=j && (m + nums[j]==target)){
                
                   arr[0]=i;
                   arr[1]=j;
                }
            }

        }
         return arr;


    }
}