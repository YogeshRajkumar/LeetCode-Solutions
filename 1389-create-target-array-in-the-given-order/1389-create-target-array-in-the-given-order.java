class Solution {
    public int[] createTargetArray(int[] arr, int[] index) {
        List<Integer> obj=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            obj.add(index[i],arr[i]);
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=obj.get(i);
        }
        return res;
    }
}