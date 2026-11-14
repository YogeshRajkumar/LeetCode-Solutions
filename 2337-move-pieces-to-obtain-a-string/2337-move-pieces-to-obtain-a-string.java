class Solution {
    public boolean canChange(String str, String target) {
        int i=0;
        int j=0;
        int n=str.length();
        while(i<n || j<n){
            while(i<n && str.charAt(i)=='_'){
                i++;
            }
            while(j<n && target.charAt(j)=='_'){
                j++;
            }
            if(i==n || j==n){
                return i==n && j==n;
            }
            if(str.charAt(i)!=target.charAt(j)){
                return false;
            }
            if(str.charAt(i)=='L' && i<j){
                return false;
            }
            if(str.charAt(i)=='R' && j<i){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}