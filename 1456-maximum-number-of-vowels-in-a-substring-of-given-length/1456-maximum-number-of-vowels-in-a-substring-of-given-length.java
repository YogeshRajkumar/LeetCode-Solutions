class Solution {
    public int maxVowels(String s, int k) {
        // int r=0;
        // int max=0;
        // int count=0;
        // while(r<s.length()){
        //     if(isVowel(s.charAt(r))){
        //         count++;
        //     }
        //     if((r+1)>k && isVowel(s.charAt(r-k))){
        //         count--;
        //     }
        //     max=Math.max(max,count);
        //     r++;
        // }
        // return max;
        int r=0;
        int count=0;
        while(r<k){
            if(isVowel(s.charAt(r))){
                count++;
            }
            r++;
        }
        int max=count;
        while(r<s.length()){
            if(isVowel(s.charAt(r))){
                count++;
            }
            if(isVowel(s.charAt(r-k))){
                count--;
            }
            max=Math.max(max,count);
            r++;
        }
        return max;
    }

    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}