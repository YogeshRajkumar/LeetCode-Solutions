class Solution {
    public int minimumCardPickup(int[] arr) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(obj.containsKey(arr[i])){
                min=Math.min(i-obj.get(arr[i])+1,min);
            }
            obj.put(arr[i],i);
        }
        return min==Integer.MAX_VALUE ? -1:min;
    }
}