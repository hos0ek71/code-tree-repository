import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int prod = 1;
    int i = 1; 
    while(i <= B) {
        prod = prod * A;
        i++;
    }
    System.out.print(prod);
    }
}