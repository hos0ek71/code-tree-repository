import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int i = 1;
    int prod = 1;
    while(i <= B) {
        if(i % A == 0) {
            prod = prod * i;
        }
        i++;
    }
    System.out.print(prod);
    }
}