import java.util.Scanner;
public class Main {
    public static boolean isRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dx = new int[] {1,-1,0,0};
        int[] dy = new int[] {0,0,1,-1};

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
    
        }
        int cnt  = 0;
        int result = 0; 
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                int nx = j + dx[j], ny = j + dy[j];
                if(isRange(nx, ny, n) && arr[nx][ny] == 1)
                    cnt++;
                    if (cnt >= 3) {
                        result++;
                    }
            }
            
        }

        // Please write your code here.
    }

}