class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int length = nums.length;
        int[] target = new int[length];
        for(int i=0 ; i< length ;i++){
           list.add(index[i],nums[i]);
        }
        for(int i=0 ;i< length ;i++){
            target[i] = list.get(i);
        }
        return target;
    }
}