class Solution {
    public boolean isPalindrome(int x) {
StringBuilder sb = new StringBuilder(Integer.toString(x));
StringBuilder rev= new StringBuilder(Integer.toString(x)).reverse();
    if(sb.toString().equals(rev.toString())){
        return true;
    }
    return false;
    }
}