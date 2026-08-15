class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int l=0;
        int r=0;
        int prod=1;
        int count=0;
        while(r<arr.length){
            prod=prod*arr[r];
            while(k<=prod && l<=r){
                prod=prod/arr[l];
                l++;
            }
            count+=(r-l)+1;
            r++;
        }
        return count;
    }
}