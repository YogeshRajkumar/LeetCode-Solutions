class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        // HashSet<Integer> obj=new HashSet<>();
        // for(int i=0;i<arr.length;i++){
        //     if(obj.contains(arr[i])){
        //         return true;
        //     }
        //     obj.add(arr[i]);
        //     if(obj.size()>k){
        //         obj.remove(arr[i-k]);
        //     }
        // }
        // return false;
        HashSet<Integer> obj=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(i>k){
                obj.remove(arr[i-k-1]);
            }
            // if(obj.contains(arr[i])){
            //     return true;
            // }
            // obj.add(arr[i]);
            if(!obj.add(arr[i])){
                return true;
            }
        }
        return false;
    }
}