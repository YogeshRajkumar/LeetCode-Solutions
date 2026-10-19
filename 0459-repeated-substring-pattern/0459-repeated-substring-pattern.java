class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=1;i<=n/2;i++){
            if(n%i!=0){
                continue;
            }
            String str=s.substring(0,i);
            int x=0;
            while(x<n){
                if(x>n || !str.equals(s.substring(x,x+str.length()))){
                    break;
                }
                x+=str.length();
            }
            if(x==n){
                return true;
            }
        }
        return false;

        // int n=s.length();
        // for(int i=1;i<=n/2;i++){
        //     if(n%i!=0){
        //         continue;
        //     }
        //     String str=s.substring(0,i);
        //     StringBuilder res=new StringBuilder();
        //     while(res.length()<n){
        //         res.append(str);
        //     }
        //     if(res.toString().equals(s)){
        //         return true;
        //     }
        // }
        // return false;
    }
}