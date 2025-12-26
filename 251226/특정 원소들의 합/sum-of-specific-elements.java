import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[4+1][4+1];
    int sum = 0; 

    for(int i = 1; i <= 4; i++){
        for(int j = 1; j <= 4; j++){
            arr[i][j]= sc.nextInt();
        }
    }

    for(int i = 1; i <= 4; i++){
        for(int j = 1; j <= i; j++){
            sum += arr[i][j];
        }
    }

    System.out.print(sum);
    }
}