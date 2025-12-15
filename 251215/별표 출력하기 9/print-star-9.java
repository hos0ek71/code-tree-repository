import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
        for(int k = 0; k < n - i; k++){
            System.out.print(" ");
        }
        

        for(int l = 0; l < (2 * i) + 1; l++) {
            System.out.print("* ");
        }
    System.out.println();
    }    

 
 
    
    }
}