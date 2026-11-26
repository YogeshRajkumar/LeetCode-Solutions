class Solution {
    public int countCompleteSubarrays(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int k=set.size();
        int l=0;
        int r=0;
        int count=0;
        int n=arr.length;
        HashMap<Integer,Integer> obj=new HashMap<>();
        while(r<arr.length){
            obj.put(arr[r],obj.getOrDefault(arr[r],0)+1);
            while(obj.size()==k){
                count+=n-r;
                int x=arr[l];
                obj.put(x,obj.get(x)-1);
                if(obj.get(x)==0){
                    obj.remove(x);
                }
                l++;
            }
            r++;
        }
        return count;
    }
}