import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cnt = 1;
    int N = sc.nextInt();
    int[][] arr = new int[N][N];

    for(int row = N-1 ; row >= 0; row--) {
        if(row % 2 != 0){
            for(int column = N- 1; column >= 0; column--) {
            arr[column][row] = cnt++;
        }
        }
        else {
            for(int column = 0; column < N; column++){
                arr[column][row] = cnt++;
            }
        }
        
    }

    for(int row = 0; row < N; row++){
        for(int column = 0; column < N; column++){
            System.out.print(arr[row][column] + " ");
        }
        System.out.println();
    }
    }
}