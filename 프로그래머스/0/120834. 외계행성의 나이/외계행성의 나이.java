class Solution {
    public String solution(int age) {
        // 나이를 문자열로 변환
        String ageStr = Integer.toString(age);
        StringBuilder answer = new StringBuilder();

        // 각 문자(숫자)를 변환하여 answer에 추가
        for (char ch : ageStr.toCharArray()) {
            answer.append((char) ('a' + (ch - '0'))); // '0'의 아스키 코드값을 기준으로 변환
        }

        return answer.toString();
    }
}
