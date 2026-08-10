class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int l=0;
        int r=k;
        double avg=(double)sum/k;
        while(r<arr.length){
            sum+=arr[r];
            sum-=arr[l];
            double curr=sum/(k*1.0);
            if(avg<curr){
                avg=curr;
            }
            l++;
            r++;
        }
        return avg;
    }
}