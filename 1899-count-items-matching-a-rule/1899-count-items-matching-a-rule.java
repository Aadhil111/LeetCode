class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int col =0;
        int count=0;
        if(ruleKey.equals("type")) col=0;
        else if(ruleKey.equals("color")) col=1;
        else col=2;

        for(int i=0 ; i<items.size() ; i++){
            if(ruleValue.equals(items.get(i).get(col)))count++;
        }
        return count;
    }
}