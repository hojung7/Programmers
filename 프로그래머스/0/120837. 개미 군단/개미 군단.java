class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        // 각 개미의 공격력
        int first = 5; // 장군개미
        int second = 3; // 병정개미
        int third = 1; // 일개미

        // 큰 단위부터 나눠서 개미 수를 계산
        answer += hp / first;  // 장군개미의 수
        hp %= first;           // 나머지 체력

        answer += hp / second; // 병정개미의 수
        hp %= second;          // 나머지 체력

        answer += hp / third;  // 일개미의 수
        
        return answer;
    }
}
