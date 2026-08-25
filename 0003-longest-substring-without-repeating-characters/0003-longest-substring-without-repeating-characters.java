class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet<Character> obj=new HashSet<>();
        // int l=0;
        // int r=0;
        // int max=0;
        // while(r<s.length()){
        //     while(obj.contains(s.charAt(r))){
        //         obj.remove(s.charAt(l));
        //         l++;
        //     }
        //     obj.add(s.charAt(r));
        //     max=Math.max(max,r-l+1);
        //     r++;
        // }
        // return max;

        boolean[] arr=new boolean[128];
        int r=0;
        int l=0;
        int max=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(!arr[ch]){
                arr[ch]=true;
            }
            else{
                while(arr[ch]){
                    arr[s.charAt(l)]=false;
                    l++;
                }
            }
            arr[ch]=true;
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
        
        // int[] arr=new int[128];
        // int r=0;
        // int l=0;
        // int max=0;
        // while(r<s.length()){
        //     char ch=s.charAt(r);
        //     arr[ch]++;
        //     while(arr[ch]>1){
        //         arr[s.charAt(l)]--;
        //         l++;
        //     }
        //     max=Math.max(max,r-l+1);
        //     r++;
        // }
        // return max;
    }
}