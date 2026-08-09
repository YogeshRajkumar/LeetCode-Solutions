class Solution {
    public int mostWordsFound(String[] sentences) {
        // int count=0;
        // for(int i=0;i<sentences.length;i++){
        //     String[] arr=sentences[i].split(" ");
        //     if(count<arr.length){
        //         count=arr.length;
        //     }
        // }
        // return count;
        int max=0;
        for(String i:sentences){
            int value=Count(i);
            if(max<value){
                max=value;
            }
        }
        return max;
    }
    
    public int Count(String str){
        int space=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                space++;
            }
        }
        return space+1;
    }
}