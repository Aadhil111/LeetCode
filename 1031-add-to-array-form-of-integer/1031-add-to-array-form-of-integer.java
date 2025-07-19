
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList list = new ArrayList<>();
        int i = num.length-1;
        while(i>=0 || k>0){
            if(i>=0)
            k += num[i];
            list.addFirst(k%10);
            k/=10;
            i--;
        }
        return list;
    }
}