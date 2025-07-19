class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int size= mat.length * mat[0].length;
        if((r*c) != size) return mat;
        int[][] result = new int[r][c];

        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0 ; i<mat.length ;i++){
            for(int j=0 ; j<mat[i].length ; j++){
                list.add(mat[i][j]);
            }
        }
        int index=0;
        for(int i=0 ;i<result.length ; i++){
            for(int j=0 ;j<result[i].length ;j++){
                if(index==list.size())break;
                result[i][j] = list.get(index++);
            }
        }
        return result;
    }
}