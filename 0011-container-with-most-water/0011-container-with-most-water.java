class Solution {
    public int maxArea(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int width=1;
        int height=Integer.MAX_VALUE;
        int res=0;
        while(l<r){
            width=r-l;
            height=Math.min(arr[l],arr[r]);
            res=Math.max(res,width*height);
            if(arr[l]<arr[r]){
                l++;
            }else{
                r--;
            }
        }
        return res;
    }
}