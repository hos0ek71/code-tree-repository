import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();


    int count = 0;

    for(int i = N; i > 0; i--) {
        for(int j = i; j > 0; j--) {
            count++;
            
        }
        for(int k = 0; k < count; k++) {
            
            System.out.print("*" + " ");
        }
        System.out.println();
        count = 0;
    }
    }
}