class Solution {
    public int countVowelSubstrings(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            HashSet<Character> obj=new HashSet<>();
            for(int j=i;j<str.length();j++){
                char c=str.charAt(j);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    obj.add(c);
                    if(obj.size()==5){
                        count++;
                    }
                }
                else{
                    break;
                }
            }
        }
        return count;
    }

    // public int countVowelSubstrings(String str) {
    //     int count=0;
    //     for(int i=0;i<str.length();i++){
    //         HashMap<Character,Integer> obj=new HashMap<>();
    //         for(int j=i;j<str.length() && isVowel(str.charAt(j));j++){
    //             obj.put(str.charAt(j),obj.getOrDefault(str.charAt(j),0)+1);
    //             if(obj.size()==5){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
    // private boolean isVowel(char c){
    //     return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    // }
}