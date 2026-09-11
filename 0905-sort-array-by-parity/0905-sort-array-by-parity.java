class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int[] res=new int[arr.length];
        int left=0;
        int right=arr.length-1;
        for(int i:arr){
            if(i%2==0){
                res[left++]=i;
            }
            else{
                res[right--]=i;
            }
        }
        return res;
    }
}