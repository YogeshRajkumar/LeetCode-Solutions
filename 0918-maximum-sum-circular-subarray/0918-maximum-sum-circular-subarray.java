class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int currMax=0;
        int max=arr[0];
        int currMin=0;
        int min=arr[0];
        int sum=0;
        for(int i:arr){
            currMax=Math.max(i,currMax+i);
            max=Math.max(currMax,max);
            currMin=Math.min(i,currMin+i);
            min=Math.min(min,currMin);
            sum+=i;
        }
        if(max<0){
            return max;
        }
        return Math.max(max,sum-min);
    }
}