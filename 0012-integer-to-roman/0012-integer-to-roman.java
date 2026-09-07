class Solution {
    public String intToRoman(int n) {
        int[] num={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] value={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder res=new StringBuilder();
        for(int i=0;i<value.length;i++){
            while(n>=num[i]){
                res.append(value[i]);
                n=n-num[i];
            }
        }
        return res.toString();
    }
}