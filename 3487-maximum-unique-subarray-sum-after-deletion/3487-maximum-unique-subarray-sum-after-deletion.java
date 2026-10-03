class Solution {
    public int maxSum(int[] arr) {
        HashSet<Integer> obj=new HashSet<>();
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i:arr){
            if(max<i){
                max=i;
            }
            if(i>0 && !obj.contains(i)){
                sum+=i;
                obj.add(i);
            }
        }
        return sum==0 ? max:sum;

        // Arrays.sort(arr);
        // int prev=arr[arr.length-1];
        // int sum=prev;
        // for(int i=arr.length-2;i>=0;i--){
        //     int curr=arr[i];
        //     if(curr<=0){
        //         return sum;
        //     }
        //     if(curr!=prev){
        //         sum+=curr;
        //     }
        //     prev=curr;
        // }
        // return sum;
    }
}