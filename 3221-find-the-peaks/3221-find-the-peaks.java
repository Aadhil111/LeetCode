import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> result = new ArrayList<>();
        int i=1;
       while(i<mountain.length-1) {
        if(mountain[i-1]<mountain[i] && mountain[i]>mountain[i+1]){
            result.add(i);
        }
        i++;
       }
       return result;
    }
}