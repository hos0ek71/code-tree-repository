import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dx = new int[] {1, -1, 0, 0};
        int[] dy = new int[] {0, 0, -1, 1};

        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dis = sc.nextInt();

            if (dir == 'E') {
                x = x + dx[0] * dis;
                y = y + dy[0] * dis;
            }
               
            else if (dir == 'W'){
                x = x + dx[1] * dis;
                y = y + dy[1] * dis;
            }
            else if (dir == 'S'){
                x = x + dx[2] * dis;
                y = y + dy[2] * dis;
            }
            else if (dir == 'N'){
                x = x + dx[3] * dis;
                y = y + dy[3] * dis;
            }
        }

        System.out.printf("%d %d", x, y);

    }
}