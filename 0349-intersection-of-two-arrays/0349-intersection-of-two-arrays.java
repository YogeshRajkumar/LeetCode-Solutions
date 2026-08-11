class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> obj=new HashSet<>();
        for(int i:arr1){
            obj.add(i);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr2){
            if(obj.contains(i)){
                list.add(i);
                obj.remove(i);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}