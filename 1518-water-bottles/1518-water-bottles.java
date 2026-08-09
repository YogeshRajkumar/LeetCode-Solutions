class Solution {
    public int numWaterBottles(int Bottles, int Exchange) {
        int n=Bottles;
        int sum=n;
        while(n>=Exchange){
            int q=n/Exchange;
            int r=n%Exchange;
            n=q+r;
            sum+=q;
        }
        return sum;
    }
}