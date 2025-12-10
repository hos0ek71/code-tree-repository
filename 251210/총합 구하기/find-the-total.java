import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int sum = 0;

    while(A <= B){

        if(A % 6 == 0 && A % 8 != 0) {
            sum += A;
        }
        A++;
    }

    System.out.print(sum);
    }
}