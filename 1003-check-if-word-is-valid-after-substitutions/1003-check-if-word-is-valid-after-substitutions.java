class Solution {
    public boolean isValid(String s) {
        Deque<Character> obj=new ArrayDeque<>();
        for(char i:s.toCharArray()){
            if(i=='a' || i=='b'){
                obj.push(i);
            }
            else{
                if(obj.size()<2){
                    return false;
                }
                if(obj.peek()!='b'){
                    return false;
                }
                obj.pop();
                if(obj.peek()!='a'){
                    return false;
                }
                obj.pop();
            }
        }
        return obj.size()==0;

        // Stack<Character> obj=new Stack();
        // for(char i:s.toCharArray()){
        //     obj.push(i);
        //     if(i=='c'){
        //         if(obj.size()<3){
        //             return false;
        //         }
        //         if(obj.get(obj.size()-3)=='a' && obj.get(obj.size()-2)=='b' && obj.get(obj.size()-1)=='c'){
        //             obj.pop();
        //             obj.pop();
        //             obj.pop();
        //         }
        //     }
        // }
        // return obj.isEmpty();   
    }
}