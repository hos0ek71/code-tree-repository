import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return; // 입력값이 없는 경우 예외 처리
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxNum = 1; // n이 1 이상일 때 최소 연속 길이는 1
        int cnt = 1; 

        // i와 i+1을 비교하기 위해 n-1 전까지만 반복합니다.
        for (int i = 0; i < n - 1; i++) {
            // 현재 요소와 다음 요소의 부호가 같은지 확인
            if ((arr[i] > 0 && arr[i + 1] > 0) || (arr[i] < 0 && arr[i + 1] < 0)) {
                cnt++;
            } else {
                // 부호가 다르거나 0이 포함된 경우 카운트 초기화
                cnt = 1;
            }

            // 최댓값 갱신
            if (cnt > maxNum) {
                maxNum = cnt;
            }
        }

        System.out.println(maxNum);
    }
}