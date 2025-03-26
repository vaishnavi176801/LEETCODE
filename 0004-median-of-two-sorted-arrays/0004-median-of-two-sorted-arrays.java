class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int n=nums1.length;
      int m=nums2.length;
      int[] ans = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < n || j < m) {
            if (i < n && (j >= m || nums1[i] <= nums2[j])) ans[k++] = nums1[i++];
            else {ans[k++] = nums2[j++];}
        }
        
        double med =0;
        int len=ans.length;
        if(len%2!=0)med=ans[len/2];
        else{
            med=(ans[len/2]+ans[len/2-1])/2.0;
        }

    return med;
    }
}