class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> obj=new ArrayList<>();
            ans.add(obj);
            for(int j=0;j<=i;j++){
                if(j==0 || i==j){
                    obj.add(1);
                }
                else{
                    int num=ans.get(i-1).get(j-1);
                    obj.add(ans.get(i-1).get(j)+num);
                }
            }
        }
        return ans;
    }
}