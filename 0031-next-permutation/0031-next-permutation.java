class Solution {
    public void nextPermutation(int[] arr) {
        int pivot=-1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i-1]<arr[i]){
                pivot=i-1;
                break;
            }
        }
        if(pivot==-1){
            Reverse(arr,0,arr.length-1);
            return;
        }
        for(int i=arr.length-1;i>0;i--){
            if(arr[pivot]<arr[i]){
                int temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
            }
        }
        Reverse(arr,pivot+1,arr.length-1);
        
    }
    public void Reverse(int[] arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}