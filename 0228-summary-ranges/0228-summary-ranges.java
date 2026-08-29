class Solution {
    public List<String> summaryRanges(int[] arr) {
        List <String> res=new ArrayList<>();
        int n=arr.length;
        if(n==0){
            return res;
        }
        int start=arr[0];
        for(int i=1;i<=n;i++){
            if(i==n || arr[i]!=arr[i-1]+1){
                if(start==arr[i-1]){
                    res.add(start+"");
                }
                else{
                    res.add(start+"->"+arr[i-1]);
                }
                if(i<n){
                    start=arr[i];
                }
            }
        }
        return res;
    }
}