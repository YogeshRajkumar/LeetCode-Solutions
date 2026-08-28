class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        int[] res=new int[n];
        res[0]=arr[0];
        for(int i=1;i<n;i++){
            int curr=arr[i];
            if(i>1){
                curr+=res[i-2];
            }
            int prev=res[i-1];
            res[i]=Math.max(curr,prev);
        }
        return res[n-1];
        // int p1=0;
        // int p2=0;
        // for(int i:arr){
        //     int temp1=i+p1;
        //     int temp2=p2;
        //     int max=Math.max(temp1,temp2);
        //     p1=p2;
        //     p2=max;
        // }
        // return p2;
    }
}