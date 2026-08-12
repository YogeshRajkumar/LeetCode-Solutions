class Solution {
    public boolean isIsomorphic(String s, String t) {
        // if(s.length()!=t.length()){
        //     return false;
        // }
        // HashMap <Character,Character> obj1=new HashMap<>();
        // HashMap <Character,Character> obj2=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     char ch1=s.charAt(i);
        //     char ch2=t.charAt(i);
        //     if(obj1.containsKey(ch1)){
        //         if(obj1.get(ch1)!=ch2){
        //             return false;
        //         }
        //     }
        //     else{
        //         obj1.put(ch1,ch2);
        //     }
        //     if(obj2.containsKey(ch2)){
        //         if(obj2.get(ch2)!=ch1){
        //             return false;
        //         }
        //     }
        //     else{
        //         obj2.put(ch2,ch1);
        //     }
        // }
        // return true;
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr1=new int[128];
        int[] arr2=new int[128];
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(arr1[ch1]!=arr2[ch2]){
                return false;
            }
            arr1[ch1]=i+1;
            arr2[ch2]=i+1;
        }
        return true;
    }
}