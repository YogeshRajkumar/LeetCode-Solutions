class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> obj=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n=i;
            boolean flag=true;
            while(n>0){
                int last=n%10;
                if(last>0){
                    if(i%last!=0){
                        flag=false;
                        break;
                    }
                }else{
                    flag=false;
                    break;
                }
                n/=10;
            }
            if(flag){
                obj.add(i);
            }
        }
        return obj;
    }
}