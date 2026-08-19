class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        HashMap<Character,Integer> obj=new HashMap<>();
        for(char i:t.toCharArray()){
            obj.put(i,obj.getOrDefault(i,0)+1);
        }
        int l=0;
        int r=0;
        int start=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        HashMap<Character,Integer> temp=new HashMap<>();
        while(r<s.length()){
            char ch=s.charAt(r);
            if(obj.containsKey(ch)){
                temp.put(ch,temp.getOrDefault(ch,0)+1);
                if(temp.get(ch)<=obj.get(ch)){
                    count++;
                }
            }
            while(count==t.length()){
                if(min>(r-l+1)){
                    min=r-l+1;
                    start=l;
                }
                char last=s.charAt(l);
                if(obj.containsKey(last)){
                    if(temp.get(last)<=obj.get(last)){
                        count--;
                    }
                    temp.put(last,temp.get(last)-1);
                }
                l++;
            }
            r++;
        }
        return min==Integer.MAX_VALUE ? "" : s.substring(start,start+min);
    }
}