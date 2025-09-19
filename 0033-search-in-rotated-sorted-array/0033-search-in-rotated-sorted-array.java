class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivot(nums);
        if(pivot==-1) return binarySearch(nums , target ,0,nums.length-1);

        else if(nums[pivot]==target) return pivot;

        else if(nums[0]>target) return binarySearch(nums , target ,pivot+1,nums.length-1);

        return binarySearch(nums , target ,0,pivot-1);
        
    }
    public int pivot(int[] nums){
        int start = 0;
        int end=nums.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && nums[mid] > nums[mid+1]) return mid;
            else if(start<mid &&nums[mid] < nums[mid-1]) return mid-1;
            else if(nums[mid] > nums[start]) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
    public int binarySearch(int nums[] ,int target ,int start ,int end){
        
        while(start <= end){
            int mid = start + (end-start) / 2;
            if(nums[mid] < target) start=mid+1;
            else if(nums[mid] > target) end = mid - 1;
            else return mid;
        }
        
        return -1;
    }
}