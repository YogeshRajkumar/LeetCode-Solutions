class Solution {
    public String longestCommonPrefix(String[] arr) {
        String str=arr[0];
        for(int i=1;i<arr.length;i++){
            while(!arr[i].startsWith(str)){
                str=str.substring(0,str.length()-1);
                if(str.isEmpty()){
                    return "";
                }
            }
        }
        return str;

        // for(int i=0;i<str[0].length();i++){
        //     char ch=str[0].charAt(i);
        //     for(int j=1;j<str.length;j++){
        //         if(i==str[j].length() || ch!=str[j].charAt(i)){
        //             return str[j].substring(0,i);
        //         }
        //     }
        // }
        // return str[0];
    }
}