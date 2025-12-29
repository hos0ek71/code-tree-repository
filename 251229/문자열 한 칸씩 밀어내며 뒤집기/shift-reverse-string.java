import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = sc.nextInt();
        
        int len = str.length();
        String result = str;

        for (int i = 0; i < N; i++) {
            int Q = sc.nextInt();
            
            if (Q == 1) {
                result = result.substring(1) + result.substring(0, 1);
            } 
            else if (Q == 2) {
                result = result.substring(len - 1, len) + result.substring(0, len - 1);
            } 
            else if (Q == 3) {
                // 원래 코드의 substring 방식을 유지한 뒤집기
                String sum = ""; // 1. 결과를 담을 변수를 루프 밖에서 선언
                for (int j = 0; j < len; j++) {
                    // 2. 뒤에서부터 한 글자씩 잘라서 sum에 더함
                    sum += result.substring(len - j - 1, len - j);
                }
                result = sum; // 3. 뒤집힌 문자열을 result에 다시 저장
            }
            
            System.out.println(result);
        }
        sc.close();
    }
}