class Solution {
    public int mySqrt(int x) {
        long ans=1;
        int i=2;
        if(x<2)return x;
        while(ans<x){
            ans = (long)i*(long)i;
            if(ans==x)return i;
            i++;
        }
        return i-2;

    }
}