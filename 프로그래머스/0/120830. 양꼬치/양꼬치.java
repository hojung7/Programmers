class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int freeDrink = n / 10;
        int paidDrink = k - freeDrink;
        if(paidDrink < 0){
            paidDrink = 0;
        }
        
        // 총 비용 계산
        answer = n * 12000 + paidDrink * 2000;
        
        return answer;
}
}
