class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int[] arr=new int[101];
        for(int i:nums){
            count+=arr[i];
            arr[i]++;
        }
        return count;
    }
}