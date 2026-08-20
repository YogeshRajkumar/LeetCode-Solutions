class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
        int pref=1;
        int suff=1;
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(suff==0){
                suff=1;
            }
            if(pref==0){
                pref=1;
            }
            pref=pref*arr[i];
            suff=suff*arr[n-i-1];
            int temp=Math.max(suff,pref);
            max=Math.max(temp,max);
        }
        return max;
    }
}