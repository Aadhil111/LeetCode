class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(!list.contains(num)){
                list.add(num);
            }
        }
        for(int listNum : list){
            int count = 0;
            for(int num : nums){
                if(listNum == num){
                    count++;
                }
            }
            if(count==1){
                return listNum;
            }
        }
        return -1;
    }
}