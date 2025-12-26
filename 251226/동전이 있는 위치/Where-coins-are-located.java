import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    int[][] placed = new int[N+1][N+1];

    for (int i = 0; i < M; i++) {
        int r = sc.nextInt();
        int c = sc.nextInt();
        placed[r][c] = 1; 
    }

    for(int i = 1; i <= N; i++){
        for(int j = 1; j <= N; j++){
            System.out.print(placed[i][j] + " ");
        }
        System.out.println();
    }

    


    
    
    }
}