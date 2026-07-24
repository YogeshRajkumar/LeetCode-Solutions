class Solution {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x<0 || x%10==0){
            return false;
        }
        int res=0;
        while(x>res){
            int l=x%10;
            res=res*10+l;
            x/=10;
        }
        return res==x || (res/10)==x;
    }
}