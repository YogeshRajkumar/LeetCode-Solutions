class Solution {
    public int romanToInt(String s) {
        // HashMap<Character,Integer> obj=new HashMap<>();
        // obj.put('I',1);
        // obj.put('V',5);
        // obj.put('X',10);
        // obj.put('L',50);
        // obj.put('C',100);
        // obj.put('D',500);
        // obj.put('M',1000);
        // int sum=0;
        // for(int i=0;i<s.length();i++){
        //     if(i<s.length()-1 && obj.get(s.charAt(i)) < obj.get(s.charAt(i+1))){
        //         sum-=obj.get(s.charAt(i));
        //     }
        //     else{
        //         sum+=obj.get(s.charAt(i));
        //     }
        // }
        // return sum;
        
        int sum=0;
        for(int i=0;i<s.length();i++){  
            int cur=Value(s.charAt(i));
            if(i<s.length()-1 && cur<Value(s.charAt(i+1))){
                sum-=cur;
            }
            else{
                sum+=cur;
            }
            
        }
        return sum;
    }

    public int Value(char ch){
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}