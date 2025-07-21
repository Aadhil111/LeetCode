class Solution {
    public int reverse(int x) {
        if (x == 0) {
            return 0; 
        }

        boolean isNegative = x < 0; 
        long longX = Math.abs((long)x); 

        String result = "";

        while (longX != 0) {
            result = result + (longX % 10);
            longX = longX / 10; 
        }

        long rev = Long.parseLong(result);
        
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }

        return isNegative ? (int) -rev : (int) rev;
    }
}
