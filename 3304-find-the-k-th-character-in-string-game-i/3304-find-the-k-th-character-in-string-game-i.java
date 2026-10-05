class Solution {
    public char kthCharacter(int k) {
        StringBuilder res=new StringBuilder("a");
        while(res.length()<k){
            String str=res.toString();
            for(char i:str.toCharArray()){
                if(i=='z'){
                    res.append('a');
                }
                else{
                    res.append((char) (i+1));
                }
            }
        }
        return res.charAt(k-1);
    }
}