class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        int even=0;
        int odd=1;
        int[] res=new int[arr.length];
        for(int i:arr){
            if(i%2==0){
                res[even]=i;
                even+=2;
            }
            else{
                res[odd]=i;
                odd+=2;
            }
        }
        return res;
    }
}