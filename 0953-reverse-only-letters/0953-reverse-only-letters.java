class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
                    while(left<right && Character.isAlphabetic(arr[left])==false){
            left++;
        }
        while(left<right && Character.isAlphabetic(arr[right])==false){
            right--;
        }
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
        }
        return new String(arr);
    }
}   