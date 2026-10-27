class Solution {
    public boolean checkStraightLine(int[][] arr) {
        for(int i=2;i<arr.length;i++){
            int x=(arr[i-1][1]-arr[i-2][1])*(arr[i][0]-arr[i-1][0]);
            int y=(arr[i][1]-arr[i-1][1])*(arr[i-1][0]-arr[i-2][0]);
            if(x!=y){
                return false;
            }
        }
        return true;
    }
}