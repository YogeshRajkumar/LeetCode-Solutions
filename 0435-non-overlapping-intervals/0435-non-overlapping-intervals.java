class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        int count=1;
        int prev=0;
        for(int i=1;i<arr.length;i++){
            if(arr[prev][1]<=arr[i][0]){
                count++;
                prev=i;
            }
        }
        return arr.length-count;

        // Arrays.sort(arr,(a,b)->a[0]-b[0]);
        // int count=0;
        // int prev=0;
        // for(int i=1;i<arr.length;i++){
        //     if(arr[prev][1]>arr[i][0]){
        //         count++;
        //         if(arr[prev][1]>arr[i][1]){
        //             prev=i;
        //         }
        //     }
        //     else{
        //         prev=i;
        //     }
        // }
        // return count;
    }
}
