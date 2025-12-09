import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int N = sc.nextInt();
    int result = A + N;

    for(int i = 0; i < N; i++){
        System.out.println(result);
        result = result + N;
    }
    }
}