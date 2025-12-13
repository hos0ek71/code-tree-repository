import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);

    double sum = 0; 
    for(int i = 0; i < 8; i++) {
        double a = sc.nextDouble();
        sum += a;
    }

    System.out.println(sum / 8);
    }
}