class Solution {
    public int[] searchRange(int[] arr, int target) {
        return new int[]{First(arr,target),Second(arr,target)};
    }
    public int First(int[] arr,int tar){
        int l=0;
        int r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(tar==arr[mid]){
                ans=mid;
                r=mid-1;
            }
            else if(arr[mid]>tar){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public int Second(int[] arr,int tar){
        int l=0;
        int r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(tar==arr[mid]){
                ans=mid;
                l=mid+1;
            }
            else if(tar<arr[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}