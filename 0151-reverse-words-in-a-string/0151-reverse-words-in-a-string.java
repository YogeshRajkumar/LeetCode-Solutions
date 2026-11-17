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
        int l=0;
        int r=0;
        int n=arr.length-1;
        Rev(arr,l,n);
        while(l<=n){
            while(l<=n && arr[l]==' '){
                l++;
            }
            if(l>n){
                break;
            }
            if(r>0){
                arr[r++]=' ';
            }
            int start=r;
            while(l<=n && arr[l]!=' '){
                arr[r++]=arr[l++];
            }
            Rev(arr,start,r-1);
        }
        return new String(arr,0,r);

        // String[] arr=s.trim().split("\\s+");
        // StringBuilder res=new StringBuilder();
        // for(int i=arr.length-1;i>=0;i--){
        //     res.append(arr[i]);
        //     if(i>0){
        //         res.append(" ");
        //     }
        // }
        // return res.toString();
    }
}