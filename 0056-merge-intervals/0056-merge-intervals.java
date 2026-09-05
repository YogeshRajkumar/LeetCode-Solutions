class Solution {
    public int[][] merge(int[][] arr) {
        ArrayList<int[]> obj=new ArrayList<>();
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        for(int i=0;i<arr.length;i++){
            int last=obj.size()-1;
            if(obj.isEmpty() || obj.get(last)[1] < arr[i][0]){
                obj.add(arr[i]);
            }
            else{
                obj.get(last)[1]=Math.max(obj.get(last)[1],arr[i][1]);
            }
        }
        return obj.toArray(new int[obj.size()][2]);
    }
}