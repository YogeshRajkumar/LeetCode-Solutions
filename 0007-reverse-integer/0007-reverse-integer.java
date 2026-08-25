class Solution {
    public int reverse(int x) {
        int res=0;
        int max=Integer.MAX_VALUE/10;
        int min=Integer.MIN_VALUE/10;
        while(x!=0){
            int l=x%10;
            if(res>max || res==max && l>7){
                return 0;
            }
            if(res<min || res==min && l<-8){
                return 0;
            }
            res=res*10+l;
            x/=10;
        }
        return res;
        // long res=0;
        // while(x!=0){
        //     long l=x%10;
        //     res=res*10+l;
        //     x/=10;
        // }
        // if(res>=Integer.MAX_VALUE || res<=Integer.MIN_VALUE){
        //     return 0;
        // }
        // return (int)(res);
    }
}