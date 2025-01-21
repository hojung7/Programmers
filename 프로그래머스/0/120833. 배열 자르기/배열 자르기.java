class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 결과 배열 크기 계산
        int[] answer = new int[num2 - num1 + 1];

        // 반복문
        for (int i = num1; i <= num2; i++) {
            answer[i - num1] = numbers[i];
        }

        return answer;
    }
}

