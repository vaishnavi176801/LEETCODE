class Solution {
    public int maxArea(int[] height) {
        int water=0;
        int n=height.length;
        int minHeight=0;
        int mostWater=0;
        int p1=0;
        int p2=n-1;

        for(int i=0;i<n;i++)
        {
            minHeight=Math.min(height[p1],height[p2]);
            water=minHeight*(p2-p1);
            if(minHeight==height[p1]) p1++;
            else if(minHeight==height[p2]){
              p2--;
            }
            mostWater=Math.max(water,mostWater);
            if(p2<=p1)break;
        }

        return mostWater;
    }
}