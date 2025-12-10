import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int sum = 0; 
    int count = 0;



    while(i <= 10){
        int A = sc.nextInt();
        if(A >= 0 && A <= 200) {
            sum = sum + A;
            count++;
        }
        i++;
    }

    double avg = (double) sum / count;

    System.out.printf("%d %.1f", sum, avg);


    }
}