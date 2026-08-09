class Solution {
    public int largestAltitude(int[] arr) {
        int max=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
}