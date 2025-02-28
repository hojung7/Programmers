import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> pokenmons = new HashSet<>();
        
        for(int num : nums){
            pokenmons.add(num);
        }
        int maxSelect = nums.length / 2;
        
        return Math.min(pokenmons.size(), maxSelect);
    }
}