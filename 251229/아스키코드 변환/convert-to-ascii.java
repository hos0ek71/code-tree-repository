import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    char A = sc.next().charAt(0);
    int N = sc.nextInt(); 

    System.out.printf("%d %c", (int)A, (char)N);

    }
}