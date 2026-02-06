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

        int cnt = 0;

        // A = (i, j)
        for (int i = 1; i < R - 1; i++) {
            for (int j = 1; j < C - 1; j++) {

                // B = (k, l)
                for (int k = i + 1; k < R; k++) {
                    for (int l = j + 1; l < C; l++) {

                        // ❌ B가 도착점이면 안됨
                        if (k == R - 1 && l == C - 1) continue;

                        // ✅ 색 조건: A와 B 색이 다르고, B와 도착점 색도 달라야 함
                        if (grid[i][j] != grid[k][l] && grid[k][l] != grid[R - 1][C - 1]) {
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}