class Solution {
    public void duplicateZeros(int[] arr) {
        int zero=0;
        for(int i:arr){
            if(i==0){
                zero++;
            }
        }
        int n=arr.length-1;
        int i=n;
        int j=n+zero;
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
    }
}