class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> obj=new ArrayList<>();
        if(s.length()<p.length()){
            return obj;
        }
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<p.length();i++){
            arr1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<p.length();i++){
            arr2[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2)){
            obj.add(0);
        }
        int j=0;
        for(int i=p.length();i<s.length();i++){
            arr1[s.charAt(j)-'a']--;
            j++;
            arr1[s.charAt(i)-'a']++;
            if(Arrays.equals(arr1,arr2)){
                obj.add(j);
            }
        }
        return obj;
    }
}