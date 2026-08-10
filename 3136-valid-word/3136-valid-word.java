class Solution {
    public boolean isValid(String str) {
        if(str.length()<3){
            return false;
        }
        boolean vow=false;
        boolean cons=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if("AEIOUaeiou".indexOf(ch)!=-1){
                vow=true;
            }
            else if(Character.isLetter(ch)){
                cons=true;
            }
            else if('0'<=ch && ch<='9'){
                continue;
            }
            else{
                return false;
            }
            
        }
        return vow && cons;
        // boolean vow=false;
        // boolean cons=false;
        // if(str.length()>=3){
        //     for(int i=0;i<str.length();i++){
        //         char ch=str.charAt(i);
        //         if(('A'<=ch && ch<='Z') || ('a'<=ch && ch<='z') || ('0'<=ch && ch<='9')){
        //             if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
        //                 vow=true;
        //             }
        //             else if(('A'<=ch && ch<='Z') || ('a'<=ch && ch<='z')){
        //                 cons=true;
        //             }
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        // }
        // return vow && cons;
    }
}