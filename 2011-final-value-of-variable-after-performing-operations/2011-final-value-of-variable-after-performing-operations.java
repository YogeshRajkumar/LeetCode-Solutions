class Solution {
    public int finalValueAfterOperations(String[] arr) {
        // int value=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i].contains("+")){
        //         value++;
        //     }else{
        //         value--;
        //     }
        // }
        // return value;
        int value=0;
        for(String i:arr){
            if(i.charAt(1)=='+'){
                value++;
            }
            else{
                value--;
            }
        }
        return value;
    }
}