class Solution {
    public int trap(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int leftMax=0;
        int rightMax=0;
        int water=0;
        while(l<r){
            if(arr[l]<arr[r]){
                if(leftMax<=arr[l]){
                    leftMax=arr[l];
                }
                else{
                    water+=leftMax-arr[l];
                }
                l++;
            }
            else{
                if(rightMax<=arr[r]){
                    rightMax=arr[r];
                }
                else{
                    water+=rightMax-arr[r];
                }
                r--;
            }
        }
        return water;
    }
}