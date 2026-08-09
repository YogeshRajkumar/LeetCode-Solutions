class Solution {
    public int countHillValley(int[] arr) {
        // ArrayList<Integer> obj=new ArrayList<>();
        // obj.add(arr[0]);
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i-1]!=arr[i]){
        //         obj.add(arr[i]);
        //     }
        // }
        // int count=0;
        // for(int i=1;i<obj.size()-1;i++){
        //     int prev=obj.get(i-1);
        //     int curr=obj.get(i);
        //     int next=obj.get(i+1);
        //     if((prev<curr && curr>next) || (prev>curr && curr<next)){
        //         count++;
        //     }
        // }
        // return count;
        int count=0;
        int prev=arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                continue;
            }
            if((prev<arr[i] && arr[i]>arr[i+1]) || (prev>arr[i] && arr[i]<arr[i+1])){
                count++;
            }
            prev=arr[i];
        }
        return count;
    }
}