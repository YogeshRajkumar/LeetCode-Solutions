class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;
        int k=0;
        while(j<chars.length){
            while(j<chars.length && chars[i]==chars[j]){
                j++;
            }
            chars[k]=chars[i];
            k++;
            if(j-i>1){
                String str=Integer.toString(j-i);
                char[] ch=str.toCharArray();
                for(char x:ch){
                    chars[k]=x;
                    k++;
                }
            }
            i=j;
        }
        return k;
    }
}