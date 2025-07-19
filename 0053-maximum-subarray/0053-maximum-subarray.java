class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            int temp = currentSum + nums[i];
            if(nums[i] > temp){
                currentSum = nums[i];
            }
            else{
                currentSum = temp;
            }
            maxSum = Math.max(currentSum , maxSum);
        }
        return maxSum;      
    }
}