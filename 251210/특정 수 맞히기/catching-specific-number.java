import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);

    while(true) {
        int N = sc.nextInt();
        if(N < 25) {
            System.out.println("Higher");
        }
        else if(N > 25) {
            System.out.println("Lower");
        }
        else if(N == 25) {
            System.out.println("Good");
            break;
        }
    }
    }
}