class Solution {
    public int jump(int[] arr) {
        int l=0;
        int r=0;
        int jump=0;
        while(r<arr.length-1){
            int far=0;
            for(int i=l;i<=r;i++){
                far=Math.max(far,i+arr[i]);
            }
            l=r+1;
            r=far;
            jump++;
        }
        return jump;
    }
}