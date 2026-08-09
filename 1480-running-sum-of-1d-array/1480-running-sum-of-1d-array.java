class Solution {
    public int[] runningSum(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+sum;
            sum=arr[i];
        }
        return arr;
    }
}