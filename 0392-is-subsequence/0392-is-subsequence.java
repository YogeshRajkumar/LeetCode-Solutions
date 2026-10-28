class Solution {
    public boolean isSubsequence(String s, String t) {
        for(char i:s.toCharArray()){
            int x=t.indexOf(i);
            if(x==-1){
                return false;
            }
            t=t.substring(x+1);;
        }
        return true;

        // int n=s.length();
        // if(n==0){
        //     return true;
        // }
        // int x=0;
        // for(char i:t.toCharArray()){
        //     if(i==s.charAt(x)){
        //         x++;
        //     }
        //     if(x==n){
        //         return true;
        //     }
        // }
        // return false;

        // int j=0;
        // int count=0;
        // for(int i=0;i<s.length();i++){
        //     while(j<t.length()){
        //         if(s.charAt(i)==t.charAt(j)){
        //             count++;
        //             j++;
        //             break;
        //         }
        //         j++;
        //     }
        // }
        // if(count==s.length()) return true;
        // return false;
    }
}