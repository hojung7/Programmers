import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] postedEmergency = emergency.clone(); // 원본 배열 복사
        
        Arrays.sort(postedEmergency); // 정렬
        
        // 응급도를 기준으로 순위 계산
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < postedEmergency.length; j++) { // 조건 수정
                if (emergency[i] == postedEmergency[postedEmergency.length - 1 - j]) {
                    answer[i] = j + 1; // 순위 저장
                    break; // 순위 결정 후 루프 탈출
                }
            }
        }
        return answer; 
    }
}
