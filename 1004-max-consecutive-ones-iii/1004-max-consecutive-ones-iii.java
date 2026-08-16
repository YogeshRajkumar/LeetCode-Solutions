class Solution {
    public int longestOnes(int[] arr, int k) {
        int l=0;
        int r=0;
        int count=0;
        int max=0;
        while(r<arr.length){
            if(arr[r]==0){
                count++;
            }
            while(count>k){
                if(arr[l]==0){
                    count--;
                }
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}