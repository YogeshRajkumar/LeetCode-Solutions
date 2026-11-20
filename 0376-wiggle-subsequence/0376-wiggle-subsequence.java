class Solution {
    public int wiggleMaxLength(int[] arr) {
        int up=1;
        int down=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                up=down+1;
            }
            else if(arr[i-1]>arr[i]){
                down=up+1;
            }
        }
        return Math.max(up,down);
    }
}