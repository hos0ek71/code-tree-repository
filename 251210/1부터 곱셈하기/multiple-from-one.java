import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int i = 1;
    int sum = 1;
    int result = 0;

    while(i <= 10) {
        sum *= i;
         if(sum >= N) {
            result = i;
            break;
        }
        i++;
       
    }
    System.out.print(result);

    }
}