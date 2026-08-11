class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        for(int i:arr1){
            obj.put(i,obj.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr2){
            if(obj.containsKey(i) && obj.get(i)!=0){
                list.add(i);
                obj.put(i,obj.get(i)-1);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}