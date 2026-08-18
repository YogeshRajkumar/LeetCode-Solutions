class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        int sum=0;
        int count=0;
        obj.put(0,1);
        for(int i:arr){
            sum+=i;
            if(obj.containsKey(sum-k)){
                count+=obj.get(sum-k);
            }
            obj.put(sum,obj.getOrDefault(sum,0)+1);
        }
        return count;
    }
}