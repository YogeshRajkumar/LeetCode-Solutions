class Solution {
    public int maximum69Number (int num) {
        String str=Integer.toString(num);
        int n=str.length();
        int[] arr=new int[n];
        boolean flag=true;
        for(int i=0;i<n;i++){
            arr[i]=str.charAt(i)-'0';
            if(flag && arr[i]==6){
                arr[i]=9;
                flag=false;
            }
        }
        int res=0;
        for(int i=0;i<n;i++){
            res=res*10+arr[i];
        }
        return res;
    }
}