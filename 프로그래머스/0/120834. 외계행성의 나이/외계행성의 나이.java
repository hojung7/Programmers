class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();

        // 나이를 문자열로 변환하여 처리
        String str = Integer.toString(age);
        for (int i = 0; i < str.length(); i++) {
            answer.append((char)(str.charAt(i) + ('a' - '0'))); // 알파벳으로 변환 후 추가
        }

        return answer.toString();
    }
}
