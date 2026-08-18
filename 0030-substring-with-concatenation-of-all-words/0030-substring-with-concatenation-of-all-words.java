class Solution {
    public List<Integer> findSubstring(String s, String[] words){
        List<Integer> res=new ArrayList<>();
        HashMap<String,Integer> obj=new HashMap<>();
        for(String i:words){
            obj.put(i,obj.getOrDefault(i,0)+1);
        }
        int len=words[0].length();
        int n=words.length;
        for(int i=0;i<len;i++){
            int r=i;
            int l=i;
            int count=0;
            HashMap<String,Integer> temp=new HashMap<>();
            while(r+len<=s.length()){
                String word=s.substring(r,r+len);
                r+=len;
                if(!obj.containsKey(word)){
                    l=r;
                    count=0;
                    temp.clear();
                    continue;
                }
                temp.put(word,temp.getOrDefault(word,0)+1);
                count++;
                while(temp.get(word)>obj.get(word)){
                    String last=s.substring(l,l+len);
                    temp.put(last,temp.get(last)-1);
                    count--;
                    l+=len;
                }
                if(count==n){
                    res.add(l);
                    String last=s.substring(l,l+len);
                    temp.put(last,temp.get(last)-1);
                    l+=len;
                    count--;
                }
            }
        }
        return res;
        // List<Integer> res=new ArrayList<>();
        // HashMap<String,Integer> obj=new HashMap<>();
        // for(String i:words){
        //     obj.put(i,obj.getOrDefault(i,0)+1);
        // }
        // int m=s.length();
        // int n=words.length;
        // int len=words[0].length();
        // for(int i=0;i<=m-(n*len);i++){
        //     HashMap<String,Integer> temp=new HashMap<>();
        //     int j=0;
        //     while(j<n){
        //         String word=s.substring(i+j*len,i+(j+1)*len);
        //         temp.put(word,temp.getOrDefault(word,0)+1);
        //         if(!obj.containsKey(word)){
        //             break;
        //         }
        //         if(temp.get(word)>obj.get(word)){
        //             break;
        //         }
        //         j++;
        //     }
        //     if(j==n){
        //         res.add(i);
        //     }
        // }
        // return res;
    }
}