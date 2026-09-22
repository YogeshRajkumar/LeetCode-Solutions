class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> obj=new Stack<>();
        for(String i:arr){
            char ch=i.charAt(0);
            if(ch=='C'){
                obj.pop();
            }
            else if(ch=='D'){
                obj.push(obj.peek()*2);
            }
            else if(ch=='+'){
                int first=obj.pop();
                int second=obj.peek();
                obj.push(first);
                obj.push(first+second);
            }
            else{
                obj.push(Integer.parseInt(i));
            }
        }
        int sum=0;
        while(!obj.isEmpty()){
            sum+=obj.pop();
        }
        return sum;
    }
}