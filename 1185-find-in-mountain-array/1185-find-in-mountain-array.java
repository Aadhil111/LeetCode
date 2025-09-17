/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakElement(mountainArr);
        int left=manualBinarySearch(mountainArr,target,0,peak);
        int right=manualBinarySearch(mountainArr,target,peak+1,mountainArr.length()-1);
        if(left!=-1) return left;
        return right;
    }
    public int findPeakElement(MountainArray mountainArr) {
        int start =0;
        int end=mountainArr.length()-1;
        while(start<end){
            int mid=start + (end-start)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1) ) start=mid+1;
            else end=mid;
        }
        return start;
    }
        public static int manualBinarySearch(MountainArray mountainArr, int target, int start, int end) {
            if(mountainArr.get(start)<mountainArr.get(end)){
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (target > mountainArr.get(mid)) start = mid + 1;
                    else if (target < mountainArr.get(mid)) end = mid - 1;
                    else return mid;
                }
            }
            else{
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (target < mountainArr.get(mid)) start = mid + 1;
                    else if (target > mountainArr.get(mid)) end = mid - 1;
                    else return mid;
                }
            }
        

        return -1;
    }
}