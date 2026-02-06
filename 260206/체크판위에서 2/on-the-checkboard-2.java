import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        char[][] grid = new char[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        char startColor = grid[0][0];
        char endColor = grid[R - 1][C - 1];

        int count = 0;

        // A = (i, j)
        for (int i = 1; i < R - 1; i++) {
            for (int j = 1; j < C - 1; j++) {

                // 시작 -> A 색 조건
                if (grid[i][j] == startColor) continue;

                // B = (k, l)
                for (int k = i + 1; k < R - 1; k++) {
                    for (int l = j + 1; l < C - 1; l++) {

                        // A -> B 색 조건
                        if (grid[k][l] == grid[i][j]) continue;

                        // B -> 도착 색 조건
                        if (grid[k][l] == endColor) continue;

                        // 조건 다 만족하면 경우의 수 1 증가
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}