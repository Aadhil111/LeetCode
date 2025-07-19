class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int[] resArr = new int[2];
        for(int i =0 ; i<nums.length ; i++){
            if(nums[i]==target){
                arrList.add(i);
            }
        }
        if(arrList.size() != 0){
            resArr[0]=arrList.getFirst();
            resArr[1]=arrList.getLast();
            return resArr;
        }
        resArr[0] = -1;
        resArr[1]=-1;
        return resArr;
        
    }
}