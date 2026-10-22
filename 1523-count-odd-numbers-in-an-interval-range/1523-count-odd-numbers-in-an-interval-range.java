class Solution {
    public int countOdds(int low, int high) {
        
        return (high+1)/2 - low/2;

        // int count=0;
        // if(low%2==0){
        //     low++;
        // }
        // for(int i=low;i<=high;i+=2){
        //     count++;
        // }
        // return count;
    }
}