class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] arr=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int x=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr[x++]=arr1[i++];
            }
            else{
                arr[x++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            arr[x++]=arr1[i++];
        }
        while(j<arr2.length){
            arr[x++]=arr2[j++];
        }
        if(arr.length%2==0){
            int n=arr.length/2;
            return (arr[n-1]+arr[n])/2.0;
        } 
        return arr[arr.length/2];
    }
}