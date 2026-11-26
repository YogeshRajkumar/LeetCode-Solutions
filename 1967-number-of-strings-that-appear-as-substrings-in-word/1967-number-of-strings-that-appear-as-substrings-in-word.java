class Solution {
    public int numOfStrings(String[] arr, String x) {
        int count=0;
        for(String i:arr){
            if(x.contains(i)){
                count++;
            }
        }
        return count;
    }
}