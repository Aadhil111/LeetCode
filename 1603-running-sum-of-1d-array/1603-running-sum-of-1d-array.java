class Solution {
    public int[] runningSum(int[] nums) {
        int length  = nums.length;
        int[] runningSum =new int[length];
        for(int i=0 ;i<length;i++){
            for(int j=0 ;j<=i ;j++){
                runningSum[i] += nums[j]; 
            }
        }
        return runningSum;
    }
}