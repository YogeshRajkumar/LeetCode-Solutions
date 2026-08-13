class Solution {
    public int singleNonDuplicate(int[] arr) {
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(mid%2==0){
                mid++;
            }
            if(arr[mid-1]==arr[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return arr[l];
    }
}