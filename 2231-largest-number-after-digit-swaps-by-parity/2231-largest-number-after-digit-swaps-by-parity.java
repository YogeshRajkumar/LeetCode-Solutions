class Solution {
    public int largestInteger(int num) {
        char[] arr=Integer.toString(num).toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int a=arr[i]-'0';
                int b=arr[j]-'0';
                if(a%2==b%2 && a<b){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return Integer.parseInt(new String(arr));

        // char[] arr=Integer.toString(num).toCharArray();
        // ArrayList<Integer> obj1=new ArrayList<>();
        // ArrayList<Integer> obj2=new ArrayList<>();
        // for(char i:arr){
        //     int n=i-'0';
        //     if(n%2==0){
        //         obj1.add(n);
        //     }
        //     else{
        //         obj2.add(n);
        //     }
        // }
        // obj1.sort(Collections.reverseOrder());
        // obj2.sort(Collections.reverseOrder());
        // StringBuilder res=new StringBuilder();
        // int i=0;
        // int j=0;
        // for(char ch:arr){
        //     int n=ch-'0';
        //     if(n%2==0){
        //         res.append(obj1.get(i++));
        //     }
        //     else{
        //         res.append(obj2.get(j++));
        //     }
        // }
        // return Integer.parseInt(res.toString());
    }
}