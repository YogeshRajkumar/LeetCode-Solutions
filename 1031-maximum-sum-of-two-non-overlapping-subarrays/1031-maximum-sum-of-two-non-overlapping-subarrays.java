class Solution {
    public int maxSumTwoNoOverlap(int[] arr, int len1, int len2) {
        return Math.max(Function(arr,len1,len2),Function(arr,len2,len1));
    }
    public int Function(int[] arr, int len1, int len2){
        int n=arr.length;
        int[] sum=new int[n+1];
        for(int i=0;i<n;i++){
            sum[i+1]=sum[i]+arr[i];
        }
        int max=0;
        int res=0;
        for(int i=len1+len2;i<=n;i++){
            int maxLen=sum[i-len2]-sum[i-len1-len2];
            max=Math.max(maxLen,max);
            int minLen=sum[i]-sum[i-len2];
            res=Math.max(res,max+minLen);
        }
        return res;
    }
}