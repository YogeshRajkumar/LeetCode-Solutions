class Solution {
    public void sortColors(int[] arr) {
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        int j=0;
        for(int i=0;i<zero;i++){
            arr[j++]=0;
        }
        for(int i=0;i<one;i++){
            arr[j++]=1;
        }
        for(int i=0;i<two;i++){
            arr[j++]=2;
        }
    }
}