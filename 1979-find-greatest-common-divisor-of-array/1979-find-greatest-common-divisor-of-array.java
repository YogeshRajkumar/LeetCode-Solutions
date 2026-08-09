class Solution {
    public int findGCD(int[] arr) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            if(max<i){
                max=i;
            }
            if(min>i){
                min=i;
            }
        }
        return GCD(max,min);
    }
    public int GCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}