class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0 ;i< image.length ;i++){

            reverse(image[i]);

            for(int j=0 ; j<image[i].length;j++){
                if(image[i][j]==0) image[i][j]=1;
                else image[i][j]=0;
            }
        }   
        return image;    
    }
    public static int[] reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }

}