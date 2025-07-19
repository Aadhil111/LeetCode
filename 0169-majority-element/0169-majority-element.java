class Solution {
    public int majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(!list.contains(num)){
                list.add(num);
            }
        }

        int maxCount=0;
        int maxVal=0;

        for(int listNum : list){
            int count = 0;
            for(int num : nums){
                if(listNum==num){
                    count++;
                }
            }
            if(maxCount<count){
                maxCount=count;
                maxVal=listNum;
            }
        }
        return maxVal;
    }
}