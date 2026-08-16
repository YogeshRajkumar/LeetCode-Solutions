class Solution {
    public int totalFruit(int[] arr) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        int l=0;
        int r=0;
        int max=0;
        while(r<arr.length){
            obj.put(arr[r],obj.getOrDefault(arr[r],0)+1);
            while(obj.size()>2){
                obj.put(arr[l],obj.get(arr[l])-1);
                if(obj.get(arr[l])==0){
                    obj.remove(arr[l]);
                }
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}