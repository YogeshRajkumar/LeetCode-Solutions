class Solution {
    public int characterReplacement(String s, int k) {
        // HashMap<Character,Integer> obj=new HashMap<>();
        // int l=0;
        // int r=0;
        // int maxFreq=0;
        // int maxLen=0;
        // while(r<s.length()){
        //     char ch=s.charAt(r);
        //     obj.put(ch,obj.getOrDefault(ch,0)+1);
        //     maxFreq=Math.max(maxFreq,obj.get(ch));
        //     if((r-l+1)-maxFreq>k){
        //         obj.put(s.charAt(l),obj.get(s.charAt(l))-1);
        //         l++;
        //     }
        //     maxLen=Math.max(maxLen,(r-l+1));
        //     r++;
        // }
        // return maxLen;
        int[] arr=new int[26];
        int l=0;
        int r=0;
        int maxFreq=0;
        int maxLen=0;
        while(r<s.length()){
            int i=s.charAt(r)-'A';
            arr[i]++;
            maxFreq=Math.max(maxFreq,arr[i]);
            if((r-l+1)-maxFreq>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}