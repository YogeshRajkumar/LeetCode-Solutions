class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res=new StringBuilder();
        for(char ch:s.toCharArray()){
            int n=res.length();
            if(n!=0 && res.charAt(n-1)==ch){
                res.deleteCharAt(n-1);
            }
            else{
                res.append(ch);
            }
        }
        return res.toString();

        // Stack<Character> obj=new Stack<>();
        // for(char i:s.toCharArray()){
        //     if(!obj.isEmpty() && obj.peek()==i){
        //         obj.pop();
        //     }
        //     else{
        //         obj.push(i);
        //     }
        // }
        // StringBuilder res=new StringBuilder();
        // while(!obj.isEmpty()){
        //     res.append(obj.pop());
        // }
        // return res.reverse().toString();
    }
}