class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // HashMap<Character,Integer> obj=new HashMap<>();
        // for(int i=0;i<ransomNote.length();i++){
        //     char ch=ransomNote.charAt(i);
        //     obj.put(ch,obj.getOrDefault(ch,0)+1);
        // }
        // for(int i=0;i<magazine.length();i++){
        //     char ch=magazine.charAt(i);
        //     if(obj.containsKey(ch) && obj.get(ch)!=0){
        //         obj.put(ch,obj.get(ch)-1);
        //         if(obj.get(ch)==0){
        //             obj.remove(ch);
        //         }
        //     }
        // }
        // return obj.size()==0;
        int[] arr=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            arr[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            if(arr[ch-'a']!=0){
                arr[ch-'a']--;
            }
        }
        int[] res=new int[26];
        return Arrays.equals(res,arr);
    }
}