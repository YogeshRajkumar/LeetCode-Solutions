class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]<=target){
                l=mid+1;;
            }
            else{
                r=mid-1;
            }
        }
        return arr[l%arr.length];
        // for(int i=0;i<arr.length;i++){
        //     if(target<arr[i]){
        //         return arr[i];
        //     }
        // }
        // return arr[0];
    }
}