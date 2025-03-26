class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] number= new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]<pivot){
              number[count]=nums[i];
               count++;

           }
        }
         for(int i=0;i<nums.length;i++){
           if(nums[i]==pivot){
              number[count]=nums[i];
               count++;

           }
         }
          for(int i=0;i<nums.length;i++){
           if(nums[i]>pivot){
              number[count]=nums[i];
               count++;

           }
        }
         
    return number;
    }
}