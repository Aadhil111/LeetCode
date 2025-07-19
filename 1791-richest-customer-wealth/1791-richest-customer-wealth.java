class Solution {
    public int maximumWealth(int[][] accounts) {
        int count=0;
        int totalCount=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                count += accounts[i][j];
            }
            totalCount = totalCount > count ? totalCount : count;
            count=0;
        }
        return totalCount;
    }
}