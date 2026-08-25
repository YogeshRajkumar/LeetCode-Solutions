class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int m=arr1.length;
        int n=arr2.length;
        int len=m+n;
        int[] res=new int[len];
        int i=0;
        int j=0;
        int x=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                res[x++]=arr1[i++];
            }
            else{
                res[x++]=arr2[j++];
            }
        }
        while(i<m){
            res[x++]=arr1[i++];
        }
        while(j<n){
            res[x++]=arr2[j++];
        } 
        if(len%2==0){
            int temp=len/2;
            return (res[temp-1]+res[temp])/2.0;
        } 
        return res[len/2];
    }
}