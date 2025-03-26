class Solution {
    public String convert(String s, int numRows) {
          int n=s.length();
    String zigzag="";
    int count=0;
    char[] zz = s.toCharArray();
    int[] arr = new int[n];
    int timesNum=0;
    if(numRows<=1)return s;


 for (int i = 0; i < n; i++) {
            arr[i] = count;

            // Determine direction (going down or up)
            if ((i/(numRows-1)) % 2 == 0) {
                count++;
            } else {
                count--;
            }

            // Adjust count when it hits the boundary
            if (count == numRows) {
                count -= 2;
            } else if (count == -1) {
                count += 2;
            }
        }


        
        for(int i=0;i<numRows;i++){
            for(int j=0;j<n;j++){
                 if(arr[j]==i){
                    zigzag+=zz[j];
                 }
            }
        }
        return zigzag;
    }
}