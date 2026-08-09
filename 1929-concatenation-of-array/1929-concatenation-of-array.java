class Solution {
    public int[] getConcatenation(int[] arr) {
        int n=arr.length;
        int[] res=new int[n+n];
        for(int i=0;i<res.length;i++){
            res[i]=arr[i%n];
        }
        return res;
    }
}