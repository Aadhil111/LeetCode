class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E' ,'I','O','U'));
        if(containsVowels(word , vowels) && containsNumber(word) && containsConsonent(word , vowels)){
        return true;
        }
        return false;
    }

    public boolean containsVowels(String word , ArrayList<Character> vowels){
        for(int i=0;i<word.length();i++){
            if(vowels.contains(word.charAt(i)))
            return true;
        }
        return false;
    }

    public boolean containsNumber(String word){
        for(int i=0;i<word.length();i++){
            if(!Character.isAlphabetic(word.charAt(i))){
                if(Character.isDigit(word.charAt(i)))
                continue;
                else
                return false;
            }
        }
        return true;
    }
    public boolean containsConsonent(String word , ArrayList<Character> vowels){
        for(int i=0;i<word.length();i++){
            if(!vowels.contains(word.charAt(i)) && Character.isAlphabetic(word.charAt(i)))
            return true;
        }
        return false;
    }
}