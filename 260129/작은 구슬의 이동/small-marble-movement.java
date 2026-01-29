import java.util.Scanner;

public class Main {

    public static boolean isRange(int nx, int ny, int n) {
        return (1<= nx && nx <= n && 1 <= ny && ny <= n);
    }

    public static int getDir(String direction){
        char dir = direction.charAt(0);

        if (dir == 'R') {
            return 0;
        }
        else if (dir == 'L'){
            return 3;
        }
        else if (dir == 'D'){
            return 1;
        }
        else {
            return 2;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        String D = sc.next();

        int[] dx = new int[] {0,1,-1,0};
        int[] dy = new int[] {1,0,0,-1};
        int dir = getDir(D);

       

                for (int k = 1; k <= T; k++){
                    int nx = R + dx[dir], ny = C + dy[dir];
                        if(!isRange(nx, ny, N)){
                            dir = (3 - dir);
                            continue;
                        }
                        
                    R =  nx;
                    C =  ny;
                        
                    
                }
            System.out.printf("%d %d ", R, C);    
    }
}