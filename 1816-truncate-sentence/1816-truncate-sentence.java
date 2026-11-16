class Solution {
    public String truncateSentence(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
            if(count==k){
                return s.substring(0,i);
            }
        }
        return s;

        // String[] arr=s.split(" ");
        // StringBuilder res=new StringBuilder();
        // for(int i=0;i<k;i++){
        //     res.append(arr[i]);
        //     if(i!=k-1){
        //         res.append(" ");
        //     }
        // }
        // return res.toString();
    }
}