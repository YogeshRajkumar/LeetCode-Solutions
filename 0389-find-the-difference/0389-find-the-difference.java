class Solution {
    public char findTheDifference(String s, String t) {
        int a=0;
        int b=0;
        for(char i:s.toCharArray()){
            a+=i;
        }
        for(char i:t.toCharArray()){
            b+=i;
        }
        return (char)(b-a);

        // int[] arr=new int[26];
        // for(char i:s.toCharArray()){
        //     arr[i-'a']++;
        // }
        // for(char i:t.toCharArray()){
        //     arr[i-'a']--;
        // }
        // for(int i=0;i<26;i++){
        //     if(arr[i]!=0){
        //         return (char)(i+'a');
        //     }
        // }
        // return '?';
    }
}