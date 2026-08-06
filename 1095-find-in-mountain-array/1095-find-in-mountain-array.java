/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int pivot=Peak(arr);
        int res=asc(arr,0,pivot-1,target);
        if(res!=-1){
            return res;
        }
        return desc(arr,pivot,arr.length()-1,target);
    }

    public int Peak(MountainArray arr){
        int l=0;
        int r=arr.length()-1;
        while(l<r){
            int mid=(l+r)/2;
            if(arr.get(l)<arr.get(mid)){
                l=mid;
            }
            else{
                r=mid;
            }
        }
        return l;
    }

    public int asc(MountainArray arr,int l,int r,int target){
        while(l<=r){
            int mid=(l+r)/2;
            if(arr.get(mid)==target){
                return mid;
            }
            if(arr.get(mid)<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }

    public int desc(MountainArray arr,int l,int r,int target){
        while(l<=r){
            int mid=(l+r)/2;
            if(target==arr.get(mid)){
                return mid;
            }
            if(arr.get(mid)<target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
}