class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> obj=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-3;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<arr.length-2;j++){
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int l=j+1;
                int r=arr.length-1;
                while(l<r){
                    long sum=(long)arr[i]+arr[j]+arr[l]+arr[r];
                    if(sum==target){
                        obj.add(Arrays.asList(arr[i],arr[j],arr[l],arr[r]));
                        while(l<r && arr[l]==arr[l+1]){
                            l++;
                        }
                        while(l<r && arr[r]==arr[r-1]){
                            r--;
                        }
                        l++;
                        r--;
                    }
                    else if(sum<target){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
        return obj;
    }
}