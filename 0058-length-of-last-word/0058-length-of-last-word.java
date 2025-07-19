class Solution {
    public int lengthOfLastWord(String s) {
        int wordLength = 0;
        int temp=0;
        for(int i = 0 ; i< s.length() ; i++){
            if(s.charAt(i) != ' ')
            wordLength++;
            if(s.charAt(i) == ' '){
                int j = i;
                while(j<s.length()){
                    if(s.charAt(j) != ' '){
                        wordLength = 0 ;
                        i=j-1;
                        break;
                    }
                    j++;
                    i=j-1;

                }
            }
        }
        return wordLength;
    }
}