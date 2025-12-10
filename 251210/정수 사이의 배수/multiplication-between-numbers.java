import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = 0;
        int count = 0;

        

        while(A <= B) {
            if(A % 5 == 0 || A % 7 == 0) {
                sum += A;
                count++;
            }
            A++;
    
        }

        double avg = (double) sum / count;

        System.out.printf("%d %.1f",sum, avg);
    }
}