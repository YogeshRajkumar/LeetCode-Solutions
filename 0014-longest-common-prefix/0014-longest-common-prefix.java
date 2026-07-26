class Solution {
    public String longestCommonPrefix(String[] str) {
        // String x=str[0];
        // for(int i=1;i<str.length;i++){
        //     while(!str[i].startsWith(x)){
        //         x=x.substring(0,x.length()-1);
        //         if(x.isEmpty()){
        //             return "";
        //         }
        //     }
        // }
        // return x;
        for(int i=0;i<str[0].length();i++){
            char ch=str[0].charAt(i);
            for(int j=1;j<str.length;j++){
                if(i==str[j].length() || ch!=str[j].charAt(i)){
                    return str[j].substring(0,i);
                }
            }
        }
        return str[0];
    }
}