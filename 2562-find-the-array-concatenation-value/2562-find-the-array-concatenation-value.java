class Solution {
    public long findTheArrayConcVal(int[] arr) {
        int l=0;
        int r=arr.length-1;
        long res=0;
        while(l<r){
            String s1=""+arr[l]+arr[r];
            res+=Integer.parseInt(s1);
            l++;
            r--;
        }
        if(arr.length%2!=0){
            res+=arr[l];
        }
        return res;
    }
}