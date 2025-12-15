import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i = n; i > 0; i--){
        for(int k =0 ; k < n-i ; k++) {
            System.out.print("  ");
        }
        for(int j = (2 * i)- 1; j >0 ;  j--) {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
    }
}