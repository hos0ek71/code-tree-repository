import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char A = sc.next().charAt(0);

    char result = (char)(A+1);
    if (result > 'z' ) {
        result = 'a';
    }

    System.out.print(result);
    }
}