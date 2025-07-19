class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0, j=mat[0].length-1 , result=0;
        while(i<mat[0].length && j>=0){
            if(i==j){
                result += mat[i][i];
                i++;
                j--;
                continue;
            }
            result += mat[i][i];
            result += mat[i][j];
            i++;
            j--;
        }
        return result;
    }
}