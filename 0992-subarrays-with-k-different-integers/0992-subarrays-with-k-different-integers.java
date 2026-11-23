class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        return Fn(arr,k)-Fn(arr,k-1);
    }
    public int Fn(int[] arr,int k){
        HashMap<Integer,Integer> obj=new HashMap<>();
        int l=0;
        int r=0;
        int count=0;
        while(r<arr.length){
            obj.put(arr[r],obj.getOrDefault(arr[r],0)+1);
            while(obj.size()>k){
                obj.put(arr[l],obj.get(arr[l])-1);
                if(obj.get(arr[l])==0){
                    obj.remove(arr[l]);
                }
                l++;
            }
            r++;
            count+=r-l;
        }
        return count;
    }
}