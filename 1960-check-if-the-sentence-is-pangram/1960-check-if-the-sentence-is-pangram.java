class Solution {
    public boolean checkIfPangram(String sentence) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for(int i='a' ; i<='z';i++){
            if(sentence.indexOf(i) < 0) return false;
        }
        return true;
    }
}