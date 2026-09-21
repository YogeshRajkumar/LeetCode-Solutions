class Solution {
    public long findTheArrayConcVal(int[] arr) {
        int l=0;
        int r=arr.length-1;
        long res=0;
        while(l<r){
            int b=arr[r];
            int count=0;
            while(b>0){
                b/=10;
                count++;
            }
            res+=(arr[l]*(int)Math.pow(10,count))+arr[r];
            l++;
            r--;
        }
        if(arr.length%2!=0){
            res+=arr[l];
        }
        return res;

        // int l=0;
        // int r=arr.length-1;
        // long res=0;
        // while(l<r){
        //     String s1=""+arr[l]+arr[r];
        //     res+=Integer.parseInt(s1);
        //     l++;
        //     r--;
        // }
        // if(arr.length%2!=0){
        //     res+=arr[l];
        // }
        // return res;
    }
}