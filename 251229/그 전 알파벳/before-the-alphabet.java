import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char A = sc.next().charAt(0);
    int result = A - 1;
    if(result > 'z') {
        result = 'a';
    }
    else if(result < 'a') {
        result = 'z';
    }
    System.out.print((char)result);
    }
}