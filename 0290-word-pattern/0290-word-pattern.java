class Solution {
    public boolean wordPattern(String pattern, String s) {
        // String[] arr=s.split(" ");
        // if(pattern.length()!=arr.length){
        //     return false;
        // }
        // HashMap<Character,String> obj1=new HashMap<>();
        // HashMap<String,Character> obj2=new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     char ch=pattern.charAt(i);
        //     String word=arr[i];
        //     if(obj1.containsKey(ch) && !(obj1.get(ch).equals(word))){
        //         return false;
        //     }
        //     if(obj2.containsKey(word) && obj2.get(word)!=ch){
        //         return false;
        //     }
        //     obj1.put(ch,word);
        //     obj2.put(word,ch);
        // }
        // return true;
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        HashMap<Character,String> obj=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String str=arr[i];
            if(obj.containsKey(ch)){
                if(!obj.get(ch).equals(str)){
                    return false;
                }
            }
            else{
                if(obj.containsValue(str)){
                    return false;
                }
                obj.put(ch,str);
            }
        }
        return true;
    }
}