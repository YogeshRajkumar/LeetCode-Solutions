class Solution {
    public int maxOperations(int[] arr, int k) {
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int count=0;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==k){
                count++;
                i++;
                j--;
            }
            else if(sum<k){
                i++;
            }
            else{
                j--;
            }
        }
        return count;

        // HashMap<Integer,Integer> obj=new HashMap<>();
        // int count=0;
        // for(int i:arr){
        //     int x=k-i;
        //     if(obj.getOrDefault(x,0)!=0){
        //         count++;
        //         obj.put(x,obj.get(x)-1);
        //     }
        //     else{
        //         obj.put(i,obj.getOrDefault(i,0)+1);
        //     }
        // }
        // return count;
    }
}