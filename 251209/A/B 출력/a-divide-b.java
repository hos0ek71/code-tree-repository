import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int inpart = A / B; 
    String result = inpart + ".";
    int rest = A % B;

    for(int i = 0; i < 20; i++){
       rest = rest * 10;
       int digit = rest / B;
       rest = rest % B;
       result = result + digit;
       
    }
    System.out.print(result);

    }
}