class Solution {
    public int numSubseq(int[] arr, int target) {
        Arrays.sort(arr);
        int n=arr.length;
        int mod=1000000007;
        long[] rem=new long[n]; 
        rem[0]=1;
        for(int i=1;i<n;i++){
            rem[i]=(rem[i-1]*2)%mod;
        }
        int l=0;
        int r=n-1;
        long sum=0;
        while(l<=r){
            if(arr[l]+arr[r]>target){
                r--;
            }
            else{
                sum=(sum+rem[r-l]) % mod;
                l++;
            }
        }
        return (int)sum;
    }
}

// Arrays.sort(arr);    
// int l=0;
// int r=arr.length-1;
//     int sum=0;
// while(l<=r){
//     if(arr[l]+arr[r]>target){
//         r--;
//     }
//     else{
//         sum+=(int)Math.pow(2,r-l)%1_000_000_007;
//         l++;            }
//     }
// }
// return sum;