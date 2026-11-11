class Solution {
    public int maxOperations(int[] arr, int k) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        int count=0;
        for(int i:arr){
            int x=k-i;
            if(obj.getOrDefault(x,0)!=0){
                count++;
                obj.put(x,obj.get(x)-1);
            }
            else{
                obj.put(i,obj.getOrDefault(i,0)+1);
            }
        }
        return count;
    }
}