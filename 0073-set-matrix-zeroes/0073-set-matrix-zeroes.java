class Solution {
    public void setZeroes(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        boolean[] row=new boolean[m];
        boolean[] col=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]||col[j]){
                    arr[i][j]=0;
                }
            }
        }

        // int m=arr.length;
        // int n=arr[0].length;
        // boolean row=false;
        // boolean col=false;
        // for(int r=0;r<n;r++){
        //     if(arr[0][r]==0){
        //         row=true;
        //     }
        // }
        // for(int c=0;c<m;c++){
        //     if(arr[c][0]==0){
        //         col=true;
        //     }
        // }
        // for(int i=1;i<m;i++){
        //     for(int j=1;j<n;j++){
        //         if(arr[i][j]==0){
        //             arr[i][0]=0;
        //             arr[0][j]=0;
        //         }
        //     }
        // }
        // for(int i=1;i<m;i++){
        //     if(arr[i][0]==0){
        //         for(int j=0;j<n;j++){
        //             arr[i][j]=0;
        //         }
        //     }
        // }
        // for(int j=1;j<n;j++){
        //     if(arr[0][j]==0){
        //         for(int i=1;i<m;i++){
        //             arr[i][j]=0;
        //         }
        //     }
        // }
        // if(row){
        //     for(int j=0;j<n;j++){
        //         arr[0][j]=0;
        //     }
        // }
        // if(col){
        //     for(int i=0;i<m;i++){
        //         arr[i][0]=0;
        //     }
        // }
    }
}