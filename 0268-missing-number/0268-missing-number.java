class Solution {
    public int missingNumber(int[] nums) {
        int sumAll=0; 
        int sumMissing=0;
        for(int i=0;i<=nums.length;i++){
            sumAll=sumAll+i;
        }
        for(int i=0;i<nums.length;i++){
            sumMissing=sumMissing+nums[i];
        }
        
        return sumAll-sumMissing;
    }
}