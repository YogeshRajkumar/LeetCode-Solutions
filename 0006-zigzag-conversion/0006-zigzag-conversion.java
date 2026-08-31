class Solution {
    public String convert(String s, int row) {
        if(row==1 || s.length()<=row){
            return s;
        }
        StringBuilder[] arr=new StringBuilder[row];
        for(int i=0;i<row;i++){
            arr[i]=new StringBuilder();
        }
        int col=0;
        boolean flag=false;
        for(char i:s.toCharArray()){
            arr[col].append(i);
            if(col==0 || col==row-1){
                flag=!flag;
            }
            col+= (flag) ? 1 : -1;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder i:arr){
            res.append(i);
        }
        return res.toString();

        // List<List<Character>> obj=new ArrayList<>();
        // for(int i=0;i<row;i++){
        //     obj.add(new ArrayList<>());
        // }
        // int n=s.length();
        // int i=0;
        // while(i<n){
        //     for(int y=0;y<row && i<n;y++){
        //         obj.get(y).add(s.charAt(i++));
        //     }
        //     for(int x=row-2;x>0 && i<n;x--){
        //         obj.get(x).add(s.charAt(i++));
        //     }
        // }
        // String res="";
        // for(i=0;i<row;i++){
        //     for(int j=0;j<obj.get(i).size();j++){
        //         res+=obj.get(i).get(j);
        //     }
        // }
        // return res;
    }
}