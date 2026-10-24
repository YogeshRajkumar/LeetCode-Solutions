class Solution {
    public boolean judgeCircle(String str) {
        // int x=0;
        // int y=0;
        // for(char i:str.toCharArray()){
        //     if(i=='U'){
        //         x++;
        //     }
        //     else if(i=='D'){
        //         x--;
        //     }
        //     else if(i=='R'){
        //         y++;
        //     }
        //     else{
        //         y--;
        //     }
        // }
        // return x==0 && y==0;

        char[] arr=new char[21];
        for(char i:str.toCharArray()){
            arr[i-'A']++;
        }
        return arr['U'-'A']==arr['D'-'A'] && arr['L'-'A']==arr['R'-'A'];

        // int x=0;
        // int y=0;
        // for(char i:str.toCharArray()){
        //     switch(i){
        //         case 'U':
        //            x++;
        //            break;
        //         case 'D': 
        //            x--;
        //            break;
        //         case 'L':
        //            y--;
        //            break;
        //         case 'R':
        //            y++;
        //            break;
        //     }
        // }   
        // return x==0 && y==0;     
    }
}