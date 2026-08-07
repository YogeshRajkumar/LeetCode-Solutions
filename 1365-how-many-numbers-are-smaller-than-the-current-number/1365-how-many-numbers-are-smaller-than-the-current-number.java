class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int n=arr.length;
        int[] sort=arr.clone();
        Arrays.sort(sort);
        HashMap<Integer,Integer> obj=new HashMap<>(); 
        for(int i=0;i<n;i++){
            obj.putIfAbsent(sort[i],i);
        }
        for(int i=0;i<n;i++){
            arr[i]=obj.get(arr[i]);
        }
        return arr;
    }
}