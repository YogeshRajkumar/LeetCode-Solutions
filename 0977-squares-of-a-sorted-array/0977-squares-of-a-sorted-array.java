class Solution {
    public int[] sortedSquares(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int x=j;
        int[] res=new int[j+1];
        while(i<=j){
            int left=arr[i]*arr[i];
            int right=arr[j]*arr[j];
            if(left<right){
                res[x--]=right;
                j--;
            }
            else{
                res[x--]=left;
                i++;
            }
        }
        return res;

        // for(int i=0;i<arr.length;i++){
        //     arr[i]=arr[i]*arr[i];
        // }
        // Arrays.sort(arr);
        // return arr;
    }
}