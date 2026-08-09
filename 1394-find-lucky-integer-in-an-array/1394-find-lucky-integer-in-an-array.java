class Solution {
    public int findLucky(int[] arr) {
        // HashMap<Integer,Integer> obj=new HashMap<>();
        // for(int i:arr){
        //     obj.put(i,obj.getOrDefault(i,0)+1);
        // }
        // int res=-1;
        // for(Map.Entry<Integer,Integer> i:obj.entrySet()){
        //     if(i.getKey().equals(i.getValue()) && res<i.getValue()){
        //         res=i.getKey();
        //     }
        // }
        // return res;
        int[] res=new int[501];
        for(int i:arr){
            res[i]++;
        }
        for(int i=500;i>0;i--){
            if(i==res[i]){
                return i;
            }
        }
        return -1;
    }
}

//.equals() for comparing two Integers