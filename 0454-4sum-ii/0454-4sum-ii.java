class Solution {
    public int fourSumCount(int[] arr1, int[] arr2, int[] arr3, int[] arr4) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        int n=arr1.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=arr1[i]+arr2[j];
                obj.put(sum,obj.getOrDefault(sum,0)+1);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=-(arr3[i]+arr4[j]);
                if(obj.containsKey(sum)){
                    count+=obj.get(sum);
                }
            }
        }
        return count;
    }
}