class NumArray {

    int[] res;

    public NumArray(int[] arr) {
        int n=arr.length;
        res=new int[n];
        res[0]=arr[0];
        for(int i=1;i<n;i++){
            res[i]=res[i-1]+arr[i];
        }
    }
    
    public int sumRange(int l, int r) {
        if(l==0){
            return res[r];
        }
        return res[r]-res[l-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */