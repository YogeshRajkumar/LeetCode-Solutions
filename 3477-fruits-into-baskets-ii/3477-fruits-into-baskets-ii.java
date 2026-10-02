class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int n=f.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(f[i]<=b[j]){
                    count++;
                    b[j]=-1;
                    break;
                }
            }
        }
        return n-count;

        // int n=f.length;
        // int count=0;
        // for(int i=0;i<n;i++){
        //     boolean flag=true;
        //     for(int j=0;j<n;j++){
        //         if(f[i]<=b[j]){
        //             b[j]=-1;
        //             flag=false;
        //             break;
        //         }
        //     }
        //     if(flag){
        //         count++;
        //     }
        // }
        // return count;
    }
}
