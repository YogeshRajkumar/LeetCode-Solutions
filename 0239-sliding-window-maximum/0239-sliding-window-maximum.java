class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
        int[] res=new int[n-k+1];
        Deque<Integer> q=new ArrayDeque<>();
        int x=0;
        for(int i=0;i<n;i++){
            while(!q.isEmpty() && q.peekFirst()<=i-k){
                q.pollFirst();
            }
            while(!q.isEmpty() && arr[q.peekLast()]<=arr[i]){
                q.pollLast();
            }
            q.offerLast(i);
            if(i>=k-1){
                res[x]=arr[q.peekFirst()];
                x++;
            }
        }
        return res;
    }
}