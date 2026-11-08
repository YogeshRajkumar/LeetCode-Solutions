class FindSumPairs {
    int[] arr1;
    int[] arr2;
    HashMap<Integer,Integer> obj=new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.arr1=nums1;
        this.arr2=nums2;
        for(int i:arr2){
            obj.put(i,obj.getOrDefault(i,0)+1);
        }
    }
    
    public void add(int index, int value) {
        int n=arr2[index];
        obj.put(n,obj.get(n)-1);
        arr2[index]+=value;
        n=arr2[index];
        obj.put(n,obj.getOrDefault(n,0)+1);
    }
    
    public int count(int total) {
        int count=0;
        for(int i:arr1){
            count+=obj.getOrDefault(total-i,0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */