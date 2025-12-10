import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int i = 1;
    int count = 0;
    

    while(i <= 1000000) {
        N = N / i;
        if(N <= 1) {
            count++;
            break;
        }

        count++;
        i++;
    }
    System.out.print(count);
    }
}