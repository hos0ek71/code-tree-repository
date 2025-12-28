import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.next();
    String find = sc.next();
    int result = str.indexOf(find);

    System.out.print(result >= 0 ? result : "No");
    }
}