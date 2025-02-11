class Solution {
    public int solution(int[] numbers) {
        int max1 = 0, max2 = 0; // 가장 큰 두 수 저장
        
        for(int num : numbers){
            if(num > max1){
                max2 = max1;
                max1 = num;
            }else if(num > max2){
                max2 = num;
            }
        }
        return max1 * max2;      

    }
}