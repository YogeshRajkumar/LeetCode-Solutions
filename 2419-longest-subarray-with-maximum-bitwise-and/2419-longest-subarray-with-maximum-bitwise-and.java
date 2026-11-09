class Solution {
    public int longestSubarray(int[] arr) {
        int max=0;
        for(int i:arr){
            if(max<i){
                max=i;
            }
        }
        int count=0;
        int maxCount=0;
        for(int i:arr){
            if(i==max){
                count++;
                maxCount=Math.max(count,maxCount);
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }
}