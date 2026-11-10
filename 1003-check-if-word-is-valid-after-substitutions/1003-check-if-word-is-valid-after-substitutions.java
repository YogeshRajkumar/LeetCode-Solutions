class Solution {
    public boolean isValid(String s) {
        Stack<Character> obj=new Stack();
        for(char i:s.toCharArray()){
            obj.push(i);
            if(i=='c'){
                if(obj.size()<3){
                    return false;
                }
                if(obj.get(obj.size()-3)=='a' && obj.get(obj.size()-2)=='b' && obj.get(obj.size()-1)=='c'){
                    obj.pop();
                    obj.pop();
                    obj.pop();
                }
            }
        }
        return obj.isEmpty();
    }
}