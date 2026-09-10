class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int n=arr.length+1;
        int[] res=new int[n];
        for(int i=2;i<n;i++){
            res[i]=Math.min(res[i-2]+arr[i-2],res[i-1]+arr[i-1]);
        }
        return res[n-1];
    }
}