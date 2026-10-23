class Solution {
    public boolean isMonotonic(int[] arr) {
        int n=arr.length;
        boolean inc=false;
        if(arr[0]<arr[n-1]){
            inc=true;
        }
        if(inc){
            for(int i=1;i<n;i++){
                if(arr[i-1]>arr[i]){
                    return false;
                }
            }
        }
        else{
            for(int i=1;i<n;i++){
                if(arr[i-1]<arr[i]){
                    return false;
                }
            }
        }
        return true;
    }
}