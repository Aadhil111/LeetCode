class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        int[][] result = new int[mat[0].length][n];

        for(int t=1;t<=4;t++){
            for(int i=0 ; i<n ;i++){
                int k=0;
                for(int j=n-1;j>=0;j--){
                    result[i][k]=mat[j][i];
                    k++;
                }
            }
            for(int i=0 ; i<result.length;i++){
                for(int j=0;j<result[0].length;j++){
                    mat[i][j]=result[i][j];
                }
            }
            System.out.println();
            if(compare(result ,target,n)){
                return true;
            }
        }
        return false;
        
    }

    public static boolean compare(int[][] result, int[][] target,int n){
        for(int i =0; i<n; i++){
            for(int j=0;j<n;j++){
                if(result[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}