class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0 ;i<candies.length;i++){
            int afterAdd=candies[i]+extraCandies;
            for(int j=0 ; j<candies.length ;j++){
                if(afterAdd < candies[j]){
                    list.add(false);
                    break;
                }
                if(j+1==candies.length){
                    list.add(true);
                }
            }
            
        }
        return list;
    }
}