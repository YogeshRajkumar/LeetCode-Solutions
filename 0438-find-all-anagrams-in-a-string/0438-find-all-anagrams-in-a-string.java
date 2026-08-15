class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> obj=new ArrayList<>();
        int n1=s.length();
        int n2=p.length();
        if(n1<n2){
            return obj;
        }
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<n2;i++){
            arr1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n2;i++){
            arr2[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2)){
            obj.add(0);
        }
        for(int i=n2;i<n1;i++){
            arr1[s.charAt(i-n2)-'a']--;
            arr1[s.charAt(i)-'a']++;
            if(Arrays.equals(arr1,arr2)){
                obj.add(i-n2+1);
            }
        }
        return obj;
        // List<Integer> obj=new ArrayList<>();
        // int n1=s.length();
        // int n2=p.length();
        // if(n1<n2){
        //     return obj;
        // }
        // int[] arr1=new int[26];
        // int[] arr2=new int[26];
        // for(int i=0;i<n2;i++){
        //     arr1[s.charAt(i)-'a']++;
        // }
        // for(int i=0;i<n2;i++){
        //     arr2[p.charAt(i)-'a']++;
        // }
        // if(Arrays.equals(arr1,arr2)){
        //     obj.add(0);
        // }
        // int j=0;
        // for(int i=n2;i<n1;i++){
        //     arr1[s.charAt(j)-'a']--;
        //     j++;
        //     arr1[s.charAt(i)-'a']++;
        //     if(Arrays.equals(arr1,arr2)){
        //         obj.add(j);
        //     }
        // }
        // return obj;
    }
}