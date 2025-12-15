import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++) {
        for(int j = n-i; j > 0; j--){
            System.out.print(" ");
        }
        for(int k = 0; k < i; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    
    
    for(int i = 0; i < n - 1; i++) {
        for(int k = 0; k <= i; k++) {
            System.out.print(" ");
        }
        for(int l = n -i-1; l > 0; l--) {
            System.out.print("* ");
        }
        System.out.println();
    }

    }
}