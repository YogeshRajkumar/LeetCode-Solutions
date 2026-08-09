class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> obj=new ArrayList<>();
        int max=0;
        for(int i:candies){
            if(max<i){
                max=i;
            }
        }
        for(int i:candies){
            if((i+extraCandies)>=max){
                obj.add(true);
            }
            else{
                obj.add(false);
            }
        }
        return obj;
    }
}