class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res=new HashSet<>();
        Set<Integer> prev=new HashSet<>();
        for(int i:arr){
            Set<Integer> curr=new HashSet<>();
            curr.add(i);
            for(int x:prev){
                curr.add(x|i);
            }
            res.addAll(curr);
            prev=curr;
        }
        return res.size();

        // HashSet<Integer> obj=new HashSet<>();
        // for(int i=0;i<arr.length;i++){
        //     int res=0;
        //     for(int j=i;j<arr.length;j++){
        //         res=res|arr[j];
        //         obj.add(res);
        //     }
        // }
        // return obj.size();
    }
}