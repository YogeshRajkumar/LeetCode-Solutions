class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(obj.containsKey(target-arr[i])){
                return new int[] {obj.get(target-arr[i]),i};
            }
            obj.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}