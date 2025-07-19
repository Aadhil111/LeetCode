class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int index=0;
        int[] result = new int[nums.length];
        while(j<nums.length){
            result[index] = nums[i++];
            result[++index] = nums[j++];
            index++;
        }
        return result;
    }
}