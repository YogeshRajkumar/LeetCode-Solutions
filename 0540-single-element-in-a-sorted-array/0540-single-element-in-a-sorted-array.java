class Solution {
    public int singleNonDuplicate(int[] arr) {
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(mid%2!=0){
                mid--;
            }
            if(arr[mid]==arr[mid+1]){
                l=mid+2;
            }
            else{
                r=mid;
            }
        }
        return arr[l];
    }
}
/*
if all double then the middle should be odd 
else there is duplicate on either one side
*/