import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 입력 받기 (수정 없음)
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalizedPerson = new int[m];
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
        }

        // 2. 로직 수정 (입력받은 배열을 시간순으로 검사)
        int[] penaltyCount = new int[n + 1];
        int ans = -1;
        for (int i = 0; i < m; i++) {
            int person = penalizedPerson[i];
            penaltyCount[person]++;
            if (penaltyCount[person] == k) {
                ans = person;
                break;
            }
        }

        // 3. 결과 출력 (필수!)
        System.out.println(ans);
    }
}