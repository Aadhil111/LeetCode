class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return arr.size();

    }
}