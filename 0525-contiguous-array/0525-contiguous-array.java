class Solution {
    public int findMaxLength(int[] arr) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        obj.put(0,-1);
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                sum--;
            }
            else{
                sum++;
            }
            if(obj.containsKey(sum)){
                max=Math.max(max,i-obj.get(sum));
            }
            else{
                obj.put(sum,i);
            }
        }
        return max;
    }
}