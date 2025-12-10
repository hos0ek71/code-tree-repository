import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    for(int i = 0; i < N; i++) {
        int A = sc.nextInt();
        if(A % 2 == 1 && A % 3 == 0) {
            System.out.println(A);
        }
    }

    }
}