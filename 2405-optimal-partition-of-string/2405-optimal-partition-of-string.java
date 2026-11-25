class Solution {
    public int partitionString(String s) {
        boolean[] arr=new boolean[26];
        int count=1;
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i)-'a';
            if(arr[x]){
                count++;
                arr=new boolean[26];
            }
            arr[x]=true;
        }
        return count;
    }
}