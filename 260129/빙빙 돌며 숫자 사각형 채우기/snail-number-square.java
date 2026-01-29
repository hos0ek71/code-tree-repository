import java.util.Scanner;
public class Main {
    public static boolean isRange(int nx, int ny, int n, int m) {
        return (0<= nx && nx < n && 0 <= ny && ny < m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        int[][] answer =  new int[n][m];
        int[] dx = new int [] {0,1,0,-1};
        int[] dy = new int [] {1,0,-1,0};
        int dirNum = 0;
        int x = 0, y = 0;

        answer[x][y] = 1;

        for (int i = 2; i <= n * m; i++){
                int nx = x + dx[dirNum], ny = y + dy[dirNum];

                if(!isRange(nx, ny, n, m) || answer[nx][ny] != 0){
                    dirNum = (dirNum + 1) % 4;
                }

            x = x + dx[dirNum];
            y = y + dy[dirNum];

            
            // System.out.printf("%d %d",x, y);
            answer[x][y] = i;
 
            }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }



        }
    }   
