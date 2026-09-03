class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int last=s.lastIndexOf(' ');
        return s.length()-last-1;
        
        // String[] arr=s.trim().split(" ");
        // return arr[arr.length-1].length();
    }
}