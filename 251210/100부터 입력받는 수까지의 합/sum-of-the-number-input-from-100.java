import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int sum = 0;
    while(N <= 100) {
        sum = sum + N;
        N++;
    }
    System.out.print(sum);
    }
}