import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides); // 오름차순
        
        if(sides[2] < sides[0] + sides[1]){
            return 1;
        }else{
            return 2;
        }
    }
}