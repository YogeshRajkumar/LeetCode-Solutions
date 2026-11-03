class Solution {
    public int numIdenticalPairs(int[] arr) {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
}