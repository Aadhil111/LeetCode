class Solution {
    public int findDuplicate(int[] nums) {
        sort(nums);
        return nums[nums.length-1];   
    }

    public void sort(int[] nums){
    int i=0;
    while(i<nums.length){
        int intendedIndex = nums[i]-1;
        if(nums[i] != nums[intendedIndex]){
            int temp = nums[i];
            nums[i] = nums[intendedIndex];
            nums[intendedIndex] = temp;
        }
        else i++;
    }
    }
}