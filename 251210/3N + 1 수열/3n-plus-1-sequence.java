import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count = 0;

    while(true) {
    
        if(N == 1) break;
        if(N % 2 == 0) {
            N = N / 2;
        }
        else {
            N = N * 3 + 1;
        }
        count++;
    }
    System.out.print(count);
    }
}