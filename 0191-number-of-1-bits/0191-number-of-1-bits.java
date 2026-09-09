class Solution {
    public int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;

        // int count=0;
        // while(n!=0){
        //     n=n & (n-1);
        //     count++;
        // }
        // return count;

        // String str=Integer.toBinaryString(n);
        // int count=0;
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='1')
        // {
        //         count++;
        //     }
        // }
        // return count;
    }
}