class Solution {
    public int[][] mergeArrays(int[][] arr1, int[][] arr2) {
        ArrayList<int[]> obj=new ArrayList<>();
        int i=0;
        int j=0;
        int m=arr1.length;
        int n=arr2.length;
        while(i<m && j<n){
            int id1=arr1[i][0];
            int id2=arr2[j][0];
            if(id1==id2){
                int sum=arr1[i][1]+arr2[j][1];
                obj.add(new int[]{id1,sum});
                i++;
                j++;
            }
            else if(id1<id2){
                obj.add(new int[]{id1,arr1[i][1]});
                i++;
            }
            else{
                obj.add(new int[]{id2,arr2[j][1]});
                j++;
            }
        }
        while(i<m){
            obj.add(new int[]{arr1[i][0],arr1[i][1]});
            i++;
        }
        while(j<n){
            obj.add(new int[]{arr2[j][0],arr2[j][1]});
            j++;
        }
        int[][] res=new int[obj.size()][2];
        for(int x=0;x<obj.size();x++){
            res[x][0]=obj.get(x)[0];
            res[x][1]=obj.get(x)[1];
        }
        return res;
    }
}