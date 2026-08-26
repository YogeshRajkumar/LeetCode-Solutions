class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res=new ArrayList<>();
        int[] arr=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']=i;
        }
        int max=0;
        int prev=-1;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[s.charAt(i)-'a']);
            if(i==max){
                res.add(i-prev);
                prev=i;
            }
        }
        return res;
    }
}