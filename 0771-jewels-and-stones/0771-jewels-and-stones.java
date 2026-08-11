class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // HashSet<Character> obj=new HashSet<>();
        // for(int i=0;i<jewels.length();i++){
        //     obj.add(jewels.charAt(i));
        // }
        // int count=0;
        // for(int i=0;i<stones.length();i++){
        //     if(obj.contains(stones.charAt(i))){
        //         count++;
        //     }
        // }
        // return count;
        boolean[] freq=new boolean[123];
        for(int i=0;i<jewels.length();i++){
            freq[jewels.charAt(i)]=true;
        }
        int count=0;
        for(int i=0;i<stones.length();i++){
            if(freq[stones.charAt(i)]){
                count++;
            }
        }
        return count;
    }
}