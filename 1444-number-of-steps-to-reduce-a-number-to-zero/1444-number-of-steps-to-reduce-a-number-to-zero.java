class Solution {
    public int numberOfSteps(int num) {
        int steps=0;
        while(num!=0){
            if(num%2 != 0){
                num -= 1;
                steps++;
            }
            else{
                num = num/2;
                steps++;
            }
            
        }
        return steps;
    }
}