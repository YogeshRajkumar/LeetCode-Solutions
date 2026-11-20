class Solution {
    public void duplicateZeros(int[] arr) {
        int count=0;
        for(int i:arr){
            if(i==0){
                count++;
            }
        }
        int n=arr.length-1;
        int i=n;
        int j=n+count;
        while(i>=0){
            if(j<=n){
                arr[j]=arr[i];
            }
            if(arr[i]==0){
                j--;
                if(j<=n){
                    arr[j]=0;
                }
            }
            i--;
            j--;
        }

        // int n=arr.length;
        // int[] res=new int[n];
        // int x=0;
        // int i=0;
        // while(i<n && x<n){
        //     if(arr[i]==0){
        //         x+=2;
        //         i++;
        //     }
        //     else{
        //         res[x++]=arr[i++];
        //     }
        // }
        // for(int j=0;j<n;j++){
        //     arr[j]=res[j];
        // }
    }
}