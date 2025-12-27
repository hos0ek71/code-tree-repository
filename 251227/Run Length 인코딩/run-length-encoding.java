import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = str.length();

        // 1. 압축된 결과를 저장할 문자열 (길이를 먼저 알아야 하므로)
        String result = "";
        
        int cnt = 1; // 첫 번째 문자는 이미 세기 시작했으므로 1
        for(int i = 0; i < N; i++) {
            // 마지막 글자이거나, 현재 글자가 다음 글자와 다를 때
            if(i == N - 1 || str.charAt(i) != str.charAt(i + 1)) {
                result += str.charAt(i); // 문자 추가
                result += cnt;           // 개수 추가
                cnt = 1;                 // 개수 초기화
            } else {
                // 다음 글자와 같다면 계속 카운트만 증가
                cnt++;
            }
        }

        // 2. 결과 출력
        System.out.println(result.length()); // 첫 번째 줄: 전체 길이
        System.out.println(result);          // 두 번째 줄: 압축 문자열
    }
}