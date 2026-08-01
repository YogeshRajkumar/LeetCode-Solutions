class Solution {
    public int removeDuplicates(int[] arr) {
        int i=2;
        for(int j=2;j<arr.length;j++){
            if(arr[i-2]!=arr[j]){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }
}