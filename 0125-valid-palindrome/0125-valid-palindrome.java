class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder res=new StringBuilder();
        // for(int i=0;i<s.length();i++){
        //     char c=Character.toLowerCase(s.charAt(i));
        //     if(Character.isLetterOrDigit(c)){
        //         res.append(c);
        //     }
        // }
        // String str=res.toString();
        // int l=0;
        // int r=str.length()-1;
        // while(l<r){
        //     if(str.charAt(l)!=str.charAt(r)){
        //         return false;
        //     }
        //     l++;
        //     r--;
        // }
        // return true;
        int l=0;
        int r=s.length()-1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}