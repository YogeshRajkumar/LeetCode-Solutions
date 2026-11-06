class Solution {
    public int hIndex(int[] arr) {
        // Arrays.sort(arr);
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     int h=n-i;
        //     if(arr[i]>=h){
        //         return h;
        //     }
        // }
        // return 0;

        int n=arr.length;
        int[] freq=new int[n+1];
        for(int i:arr){
            freq[Math.min(i,n)]++;
        }
        int sum=0;
        for(int i=n;i>=0;i--){
            sum+=freq[i];
            if(sum>=i){
                return i;
            }
        }
        return 0;
    }
}