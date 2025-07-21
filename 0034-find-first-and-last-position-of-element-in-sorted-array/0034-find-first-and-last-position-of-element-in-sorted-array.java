class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        result[0] = search(nums,target,true);
        result[1] = search(nums,target,false);
        return result;
    }

    public int search(int[] nums , int target , Boolean firstIndex){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]) start = mid+1;
            else if(target<nums[mid]) end=mid-1;
            else{
                ans=mid;
                if(firstIndex) end =mid-1;
                else start=mid+1;
            }
        }
        return ans;
    }
}