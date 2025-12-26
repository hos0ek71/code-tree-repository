import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] arr = new int[N+1][N+1];

    int count = 1; 
    for(int i = 0; i < M; i++){
        int r = sc.nextInt();
        int c = sc.nextInt();

        arr[r][c] = count++;
    }

    for(int i = 1; i <= N; i++){
        for(int j = 1; j <= N; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }

    }
}