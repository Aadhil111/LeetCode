class Solution {
    public int missingNumber(int[] nums) {
        sort(nums);
        for(int i=0;i<nums.length ;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    public static void sort(int[] nums){
        int i = 0;
        while(i<nums.length){
            if(nums[i] == nums.length) {
                i++;
            }
            else{
                int intendedIndex=nums[i];
                if(nums[i] != nums[intendedIndex]){
                    int temp=nums[i];
                    nums[i]=nums[intendedIndex];
                    nums[intendedIndex]=temp;
                }
                else i++;
            }
            
        }
    }
}