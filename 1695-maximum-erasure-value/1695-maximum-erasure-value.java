class Solution {
    public int maximumUniqueSubarray(int[] arr) {
        int l=0;
        int r=0;
        int n=arr.length;
        boolean[] freq=new boolean[100001];
        int max=0;
        int sum=0;
        while(r<n){
            while(freq[arr[r]]){
                freq[arr[l]]=false;
                sum-=arr[l];
                l++;
            }
            freq[arr[r]]=true;
            sum+=arr[r];
            if(max<sum){
                max=sum;
            }
            r++;
        }
        return max;

        // int r=0;
        // int l=0;
        // int sum=0;
        // int max=0;
        // HashSet<Integer> obj=new HashSet<>();
        // while(r<arr.length){
        //     while(obj.contains(arr[r])){
        //         obj.remove(arr[l]);
        //         sum-=arr[l];
        //         l++;
        //     }
        //     obj.add(arr[r]);
        //     sum+=arr[r];
        //     if(max<sum){
        //          max=sum;
        //     }
        //     r++;
        // }
        // return max;
    }
}