class Solution {
    public String tictactoe(int[][] arr) {
        int n=arr.length;
        char[][] res=new char[3][3];
        for(int i=0;i<n;i++){
            int r=arr[i][0];
            int c=arr[i][1];
            char ch=i%2==0 ? 'x':'o';
            res[r][c]=ch;
            if(
               (res[0][0]==ch && res[1][1]==ch && res[2][2]==ch) ||
               (res[0][2]==ch && res[1][1]==ch && res[2][0]==ch) ||
               (res[r][0]==ch && res[r][1]==ch && res[r][2]==ch) ||
               (res[0][c]==ch && res[1][c]==ch && res[2][c]==ch)
            ){
                return ch=='x'? "A":"B";
            }
        }
        return n==9 ? "Draw":"Pending";
    }
}