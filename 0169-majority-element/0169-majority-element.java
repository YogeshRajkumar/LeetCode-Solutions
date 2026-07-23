class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length/2;
        Map<Integer,Integer> obj=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            obj.put(arr[i],obj.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> i:obj.entrySet()){
            if(i.getValue()>n){
                return i.getKey();
            }
        }
        return -1;
    }
}