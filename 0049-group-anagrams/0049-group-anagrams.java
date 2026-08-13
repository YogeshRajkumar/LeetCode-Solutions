class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        HashMap<String,List<String>> obj=new HashMap<>();
        for(String i:arr){
            char[] c=i.toCharArray();
            Arrays.sort(c);
            String str=new String(c);
            if(!obj.containsKey(str)){
                obj.put(str,new ArrayList<>());
            }
            obj.get(str).add(i);
           
        }
        List<List<String>> res=new ArrayList<>();
        // for(Map.Entry<String,List<String>> i:obj.entrySet()){
        //     res.add(i.getValue());
        // }
        for(List i:obj.values()){
            res.add(i);
        }
        return res;
    }
}