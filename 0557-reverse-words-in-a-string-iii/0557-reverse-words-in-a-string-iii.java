class Solution {
    public void Rev(char[] arr,int l,int r){
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;   
        }
    }

    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]==' '){
                Rev(arr,j,i-1);
                j=i+1;
            }
            if(i==n-1){
                Rev(arr,j,i);
            }
        }
        return new String(arr);

        // StringBuilder res=new StringBuilder();
        // int n=s.length();
        // int j=0;
        // for(int i=0;i<=n;i++){
        //     if(i==n || s.charAt(i)==' '){
        //         for(int k=i-1;k>=j;k--){
        //             res.append(s.charAt(k));
        //         }
        //         if(i!=n){
        //             res.append(" ");
        //         }
        //         j=i+1;
        //     }
        // }
        // return res.toString();
    }      
}