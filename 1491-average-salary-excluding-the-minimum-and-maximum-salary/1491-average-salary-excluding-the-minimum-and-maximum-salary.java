class Solution {
    public double average(int[] arr) {
        Arrays.sort(arr);
        int sum=0;
        int n=arr.length-2;
        for(int i=1;i<=n;i++){
            sum+=arr[i];
        }
        return(double) (sum/(n*1.0));
    }
}