import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 예: 5

        // [상단부] 0부터 n-1까지 (총 n줄)
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // 짝수 줄: N에서 줄어드는 별 (N, N-1, N-2...)
                for (int j = 0; j < n - (i / 2); j++) {
                    System.out.print("* ");
                }
            } else {
                // 홀수 줄: 1에서 늘어나는 별 (1, 2, 3...)
                for (int j = 0; j < (i / 2) + 1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // [하단부] n-1부터 0까지 거꾸로 (총 n줄) -> 완벽한 대칭
        for (int i = n - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                // 상단부와 로직 100% 동일
                for (int j = 0; j < n - (i / 2); j++) {
                    System.out.print("* ");
                }
            } else {
                // 상단부와 로직 100% 동일
                for (int j = 0; j < (i / 2) + 1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}