class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       ArrayList<Integer> list = new ArrayList<>();

        int topRow=0;
        int bottomRow=matrix.length-1;
        int leftColumn=0;
        int rightColumn=matrix[0].length-1;

        while(leftColumn <= rightColumn && topRow <= bottomRow){

        for(int i=leftColumn ; i<=rightColumn ;i++){
            list.add(matrix[topRow][i]);
        }
        topRow++;

        for(int i=topRow ; i<=bottomRow ; i++){
            list.add(matrix[i][rightColumn]);
        }
        rightColumn--;

        if(topRow<=bottomRow){
        for(int i=rightColumn ; i>=leftColumn ;i--){
            list.add(matrix[bottomRow][i]);
        }
        }
        bottomRow--;

        if(leftColumn<=rightColumn){
        for(int i=bottomRow ; i>=topRow;i--){
            list.add(matrix[i][leftColumn]);
        }
        }
        leftColumn++;

        }
        return list;
    }
}