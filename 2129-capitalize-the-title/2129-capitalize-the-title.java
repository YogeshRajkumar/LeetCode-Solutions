class Solution {
    public String capitalizeTitle(String str) {
        int n=str.length();
        char[] arr=str.toCharArray();
        int i=0;
        while(i<n){
            int j=i;
            while(j<n && arr[j]!=' '){
                j++;
            }
            if(j-i<=2){
                for(int x=i;x<j;x++){
                    arr[x]=Character.toLowerCase(arr[x]);
                }
            }
            else{
                arr[i]=Character.toUpperCase(arr[i]);
                for(int x=i+1;x<j;x++){
                    arr[x]=Character.toLowerCase(arr[x]);
                }
            }
            i=j+1;
        }
        return new String(arr);

        // StringBuilder res=new StringBuilder();
        // String[] arr=str.split(" ");
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i].length()<3){
        //         res.append(arr[i].toLowerCase());
        //         if(arr.length-1!=i){
        //             res.append(" ");
        //         }
        //     }
        //     else{
        //         res.append(Character.toUpperCase(arr[i].charAt(0)));
        //         res.append(arr[i].substring(1).toLowerCase());
        //         if(arr.length-1!=i){
        //             res.append(" ");
        //         }
        //     }
        // }
        // return res.toString();
    }
}