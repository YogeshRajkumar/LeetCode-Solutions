class Solution {
    public int maximumUnits(int[][] arr, int truckSize) {
        Arrays.sort(arr,(a,b)->b[1]-a[1]);
        int size=truckSize;
        int unit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]<=size){
                unit+=arr[i][0]*arr[i][1];
                size-=arr[i][0];
            }
            else{
                unit+=arr[i][1]*size;
                break;
            }
        }
        return unit;
    }
}