class Solution {
    public String capitalizeTitle(String str) {
        StringBuilder res=new StringBuilder();
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<3){
                res.append(arr[i].toLowerCase());
                if(arr.length-1!=i){
                    res.append(" ");
                }
            }
            else{
                res.append(Character.toUpperCase(arr[i].charAt(0)));
                res.append(arr[i].substring(1).toLowerCase());
                if(arr.length-1!=i){
                    res.append(" ");
                }
            }
        }
        return res.toString();
        
        // String[] arr=str.split(" ");
        // String res="";
        // for(String i:arr){
        //     if(i.length()<3){
        //         res+=i.toLowerCase();
        //         res+=" ";
        //     }else{
        //     res+=Character.toUpperCase(i.charAt(0));
        //     res+=i.substring(1).toLowerCase();
        //     res+=" ";
        //     }
        // }
        // return res.toString().trim();
    }
}