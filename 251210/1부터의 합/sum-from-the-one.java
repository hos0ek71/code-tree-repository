import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int i = 1; 

    int sum = 0;
    while(i <= 100) {
        sum += i;
        if(sum >= N) {
            sum = i;
            break;
        }
        i++;
    }

    System.out.print(sum);


    }
}