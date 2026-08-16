class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int l=0;
        int r=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(r<arr.length){
            sum+=arr[r];
            while(sum>=target){
                min=Math.min(min,r-l+1);
                sum-=arr[l];
                l++;
            }
            r++;
        }
        return (min==Integer.MAX_VALUE) ? 0:min;
    }
}