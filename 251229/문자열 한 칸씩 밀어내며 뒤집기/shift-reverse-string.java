import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 초기 문자열과 연산 횟수 N 입력
        String result = sc.next();
        int N = sc.nextInt();

        int len = result.length();

        for (int i = 0; i < N; i++) {
            int Q = sc.nextInt();

            if (Q == 1) {
                // 왼쪽으로 한 칸 회전 (ABC -> BCA)
                result = result.substring(1) + result.substring(0, 1);
            } 
            else if (Q == 2) {
                // 오른쪽으로 한 칸 회전 (ABC -> CAB)
                result = result.substring(len - 1) + result.substring(0, len - 1);
            } 
            else if (Q == 3) {
                // 문자열 뒤집기 (ABC -> CBA)
                StringBuilder sb = new StringBuilder(result);
                result = sb.reverse().toString();
            }

            // 각 연산 후 결과 출력
            System.out.println(result);
        }
        sc.close();
    }
}