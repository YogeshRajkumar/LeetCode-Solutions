class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int close=arr[0]+arr[1]+arr[2];
        for(int i=0;i<arr.length-2;i++){
            int l=i+1;
            int r=arr.length-1;
            while(l<r){
                int sum=arr[i]+arr[l]+arr[r];
                if(Math.abs(sum-target)<Math.abs(close-target)){
                    close=sum;
                }
                if(sum==target){
                    return close;
                }
                else if(sum>target){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return close;
    }
}