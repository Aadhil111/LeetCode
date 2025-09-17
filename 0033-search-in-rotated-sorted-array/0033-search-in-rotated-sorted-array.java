class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0] == target) return 0;
            else return -1;
        }
        int i=0;
        int index=0;
        while(i<nums.length-1){
            if(nums[index]<nums[index+1]) index++;
            else break;
            i++;
        }
        int left=manualBinarySearch(nums , target , 0 ,index);
        int right=manualBinarySearch(nums , target , index+1 ,nums.length-1);
        if(left != -1) return left;
        else if(right != -1) return right;
        return -1;
    }
    public int manualBinarySearch(int[] nums , int target ,int start , int end ){
        while(start<=end){
            int mid = start + (end -start)/2;
            if(target>nums[mid]) start = mid+1;
            else if(target<nums[mid]) end = mid-1;
            else return mid;
        }
        return -1;
    }
}