class Solution {
    public int arraySign(int[] arr) {
        int res=1;
        for(int i:arr){
            if(i==0){
                return 0;
            }
            else if(i<0){
                res=-res;
            }
        }
        return res;
    }
}