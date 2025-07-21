class Solution {
    public String reverseVowels(String s) {
        char[] str= s.toCharArray();
        String vowels="aeiouAEIOU";
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && vowels.indexOf(str[left]) == -1){
                left++;
            }
            while(left<right && vowels.indexOf(str[right]) == -1){
                right--;
            }
            char temp=str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
        }
        return  new String(str);

    }
}