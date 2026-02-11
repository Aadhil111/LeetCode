class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] myNums = nums.clone();
        Arrays.sort(myNums);

        int sum=0;
        int num1=0;
        int num2=0;
        int left=0;
        int right=myNums.length-1;
        while(left < right){
            sum=myNums[left] + myNums[right];
            if(sum == target){
                num1=myNums[left];
                num2=myNums[right];
                break;
            }
            else if(sum > target) right--;
            else left++;
        }

        int index1=-1;
        int index2=-1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]==num1 && index1==-1) index1 = i;
            else if(nums[i]==num2) index2 = i;
        }
        return new int[]{index1,index2};
    }
}