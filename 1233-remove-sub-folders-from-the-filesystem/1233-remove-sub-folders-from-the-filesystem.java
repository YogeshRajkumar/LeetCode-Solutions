class Solution {
    public List<String> removeSubfolders(String[] arr) {
        Arrays.sort(arr);
        ArrayList<String> obj=new ArrayList<>();
        obj.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            String prev=obj.get(obj.size()-1);
            if(!arr[i].startsWith(prev+"/")){
                obj.add(arr[i]);
            }
        }
        return obj;
    }
}