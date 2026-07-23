class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> obj=new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i-1]==arr[i]){
                continue;
            }
            int l=i+1;
            int r=arr.length-1;
            while(l<r){
                int sum=arr[i]+arr[l]+arr[r];
                if(sum==0){
                    obj.add(Arrays.asList(arr[i],arr[l],arr[r]));
                    while(l<r && arr[l]==arr[l+1]){
                        l++;
                    }
                    while(l<r && arr[r]==arr[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }
                else if(sum<0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return obj;
    }
}