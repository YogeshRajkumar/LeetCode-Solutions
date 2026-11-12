class Solution {
    public int countKDifference(int[] arr, int k) {
        // HashMap<Integer,Integer> obj=new HashMap<>();
        // int count=0;
        // for(int i:arr){
        //     count+=obj.getOrDefault(i-k,0);
        //     count+=obj.getOrDefault(i+k,0);
        //     obj.put(i,obj.getOrDefault(i,0)+1);
        // }
        // return count;

        int[] freq=new int[101];
        for(int i:arr){
            freq[i]++;
        }
        int count=0;
        for(int i=1;i+k<101;i++){
            count+=freq[i]*freq[i+k];
        }
        return count;
    }
}