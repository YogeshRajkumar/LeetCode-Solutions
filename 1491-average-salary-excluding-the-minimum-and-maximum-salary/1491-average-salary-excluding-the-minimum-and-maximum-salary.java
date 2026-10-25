class Solution {
    public double average(int[] arr) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            if(max<i){
                max=i;
            }
            if(min>i){
                min=i;
            }
            sum+=i;
        }
        return (sum-max-min)/(arr.length-2*1.0);

        // Arrays.sort(arr);
        // int sum=0;
        // int n=arr.length-2;
        // for(int i=1;i<=n;i++){
        //     sum+=arr[i];
        // }
        // return sum/(n*1.0);
    }
}