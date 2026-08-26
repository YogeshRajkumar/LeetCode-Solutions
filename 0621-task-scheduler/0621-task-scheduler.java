class Solution {
    public int leastInterval(char[] arr, int n) {
        int[] freq=new int[26];
        for(char i:arr){
            freq[i-'A']++;
        }
        int max=0;
        for(int i:freq){
            if(max<i){
                max=i;
            }
        }
        int count=0;
        for(int i:freq){
            if(max==i){
                count++;
            }
        }
        int len=(max-1)*(n+1)+count;
        return Math.max(len,arr.length);
    }
}