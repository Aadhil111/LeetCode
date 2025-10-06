class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        sort(nums);
        for(int i=0;i<n ;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return n;
    }

    public static void sort(int[] nums){
        int n = nums.length;
        int i = 0;
        while(i<n){
            if(nums[i] == n) {
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