import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 행(Row)
        int M = sc.nextInt(); // 열(Column)
        int[][] arr = new int[N][M];
        
        int count = 1; 

        for(int d = 0; d <= (N + M)-2; d++) {
            for(int row = 0; row < N; row++){
                int column = d - row; 
                
                if(column >= 0 && column <= M-1) {
                    arr[row][column] = count++;
                }
                
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    
    }
}