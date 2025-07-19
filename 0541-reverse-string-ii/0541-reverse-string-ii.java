class Solution {
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();

        if(arr.length<=k){
            reverse(arr , 0 ,arr.length-1);
            String result=String.valueOf(arr);
            return result;
            }

        for(int i=0 ; i<arr.length ;i++){
            int start=i*(2*k);
            int end=i*(2*k)+(k-1) ;
            if(start>=arr.length)break;
            if(end>arr.length){
                reverse(arr,start,arr.length-1);
                break;
            }
            reverse(arr,start , end);

        }

        String result=String.valueOf(arr);
        return result;
    }

    public void reverse(char[] arr , int start , int end){
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end] ;
            arr[end]=temp;
            start++;
            end--;
        }
    }
}