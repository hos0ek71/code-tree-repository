import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
        for(int k = 0; k < n - i-1; k++){
            System.out.print("  ");
        }
        

        for(int l = 0; l < (2 * i) + 1; l++) {
            System.out.print("* ");
        }
    System.out.println();
    }    

 
 
    
    }
}
// 각열의 공백의 수 = 처음주어진열의수 

// 0열이면 2  수 (3) - 열 (0)
// 1열이면 1  수(3) - 열(1)
// 2열이면 0   수(3) - 열(2)