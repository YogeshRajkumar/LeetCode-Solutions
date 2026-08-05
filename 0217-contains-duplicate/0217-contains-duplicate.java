class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashSet obj=new HashSet<>();
        for(int i:arr){
            if(obj.contains(i)){
                return true;
            }
            obj.add(i);
        }
        return false;
    }
}