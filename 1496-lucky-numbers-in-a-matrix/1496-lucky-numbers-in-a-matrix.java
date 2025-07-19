class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            if( maxElementInColumn(matrix ,i, IndexOfminElementInArr(matrix[i]))  ) list.add(matrix[i][IndexOfminElementInArr(matrix[i])]) ;
        }
        return list;
    }
    public static boolean maxElementInColumn(int[][] matrix , int row, int elementIndex  ){
        for(int i=0;i<matrix.length;i++){
            if(!(matrix[row][elementIndex] >= matrix[i][elementIndex])){
               return false;
            }
        }
        return true;
    }
    public static int IndexOfminElementInArr(int[] arr){
        int min=Integer.MAX_VALUE;
        int index = 0;
        for(int i=0 ;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        return index;
    }
}