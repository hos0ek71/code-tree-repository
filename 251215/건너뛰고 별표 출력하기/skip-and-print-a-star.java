import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 문제에서 N을 입력받으라고 했으므로 Scanner 사용
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        // 1. 증가하는 부분 (1개부터 N개까지)
        for (int i = 1; i <= n; i++) {
            // 별 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 별 다 찍고 줄바꿈
            System.out.println(); // "건너뛰고"를 위해 빈 줄 하나 더 추가
        }

        // 2. 감소하는 부분 (N-1개부터 1개까지)
        for (int i = n - 1; i >= 1; i--) {
            // 별 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 별 다 찍고 줄바꿈
            System.out.println(); // "건너뛰고"를 위해 빈 줄 하나 더 추가
        }
    }
}