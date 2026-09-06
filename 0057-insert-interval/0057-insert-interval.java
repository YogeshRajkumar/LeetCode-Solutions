class Solution {
    public int[][] insert(int[][] arr, int[] add) {
        List<int[]> obj=new ArrayList<>();
        int i=0;
        int n=arr.length;
        while(i<n && arr[i][1] < add[0]){
            obj.add(arr[i]);
            i++;
        }
        while(i<n && arr[i][0] <= add[1]){
            add[0]=Math.min(arr[i][0],add[0]);
            add[1]=Math.max(arr[i][1],add[1]);
            i++;
        }
        obj.add(add);
        while(i<n){
            obj.add(arr[i]);
            i++;
        }
        return obj.toArray(new int[obj.size()][2]);
    }
}