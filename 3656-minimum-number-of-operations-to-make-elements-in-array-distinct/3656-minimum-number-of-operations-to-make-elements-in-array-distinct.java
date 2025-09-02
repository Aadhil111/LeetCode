class Solution {
    public int minimumOperations(int[] nums) {
        int startIndex=0;
        int count=0;
        while(!isDistinct(nums,startIndex)){
            startIndex += 3;
            count++;
        }
        return count;
    }

    public boolean isDistinct(int[] nums,int startIndex){
        for(int i=startIndex;i<nums.length;i++){
            for(int j=startIndex;j<nums.length;j++){
                if(i==j)continue;
                if(nums[i]==nums[j]) return false;
            }
        }
        return true;
    }
}