class Solution {
    public int missingNumber(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int total=(n*(n+1))/2;
        return total-sum;
    }
}