import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = sc.next(); // 초기 문자열
        int N = sc.nextInt();      // 연산 횟수
        int len = result.length();

        for (int i = 0; i < N; i++) {
            int Q = sc.nextInt();

            if (Q == 1) {
                // 왼쪽 회전: 1번 인덱스부터 끝까지 + 0번 인덱스
                result = result.substring(1) + result.substring(0, 1);
            } 
            else if (Q == 2) {
                // 오른쪽 회전: 마지막 글자 + 0번부터 마지막 직전까지
                result = result.substring(len - 1) + result.substring(0, len - 1);
            } 
            else if (Q == 3) {
                // 문자열 뒤집기 (반복문 사용)
                String reversed = ""; 
                for (int j = len - 1; j >= 0; j--) {
                    // 뒤에서부터 한 글자씩 가져와서 새로운 문자열에 더함
                    reversed += result.charAt(j);
                }
                result = reversed; // 뒤집힌 문자열을 다시 result에 저장
            }

            System.out.println(result);
        }
        sc.close();
    }
}