class Solution {
    public String mergeAlternately(String str1, String str2) {
        StringBuilder res=new StringBuilder();
        int i=0;
        int j=0;
        int n1=str1.length();
        int n2=str2.length();
        while(i<n1 || j<n2){
            if(i<n1){
                res.append(str1.charAt(i++));
            }
            if(j<n2){
                res.append(str2.charAt(j++));
            }
        }
        return res.toString();
    }
}