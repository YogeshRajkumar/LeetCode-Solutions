class Solution {
    public int[] applyOperations(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[i] && arr[i]!=0){
                arr[i-1]=arr[i-1]*2;
                arr[i]=0;
            }
        }
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
        }
        while(k<n){
            arr[k++]=0;
        }
        return arr;
    }
}