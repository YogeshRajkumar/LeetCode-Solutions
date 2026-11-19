class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] res=new int[arr.length];
        int p=0;
        int n=1;
        for(int i:arr){
            if(i<0){
                res[n]=i;
                n+=2;
            }
            else{
                res[p]=i;
                p+=2;
            }
        }
        return res;
    }
}