class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        sort(nums);
        for(int i=0 ; i< nums.length ; i++){
            if(nums[i] != i+1){
                arr[0] = nums[i];
                arr[1] = i+1;
            }
        }
        return arr;
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