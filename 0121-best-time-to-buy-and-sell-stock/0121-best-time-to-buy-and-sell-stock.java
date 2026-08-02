class Solution {
    public int maxProfit(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            int diff=arr[i]-min;
            if(max<diff){
                max=diff;
            }
        }
        return max;
    }
}