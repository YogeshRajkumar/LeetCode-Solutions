class Solution {
    public int possibleStringCount(String str) {
        int sum=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)==str.charAt(i)){
                sum++;
            }
        }
        return sum;

        // int[] arr=new int[26];
        // for(char i:word.toCharArray()){
        //     arr[i-'a']++;
        // }
        // int sum=1;
        // for(int i=0;i<26;i++){
        //     if(arr[i]>0){
        //         sum+=(arr[i]-1);
        //     }
        // }
        // return sum;
    }
}