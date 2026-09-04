class Solution {
    public int singleNumber(int[] arr) {
        int res=0;
        for(int i:arr){
            res=res^i;
        }
        return res;
        
        // HashMap<Integer,Integer> obj=new HashMap<>();
        // for(int i:arr){
        //     obj.put(i,obj.getOrDefault(i,0)+1);
        // }
        // for(Map.Entry<Integer,Integer> i:obj.entrySet()){
        //     if(i.getValue()==1){
        //         return i.getKey();
        //     }
        // }
        // return -1;
    }
}