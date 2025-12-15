import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++) {
        if(i % 2 != 0) {
            for(int j = 1;  j <= (i / 2) + 1 ; j++) {
                System.out.print("* ");
            }
        }
        else if(i % 2 == 0) {
            for(int j = (n + 1) - (i / 2); j > 0; j--) {
            System.out.print("* ");
        }
        }
    System.out.println();    
    }

    for(int i = n; i > 0; i--) {
        if(i % 2 == 1){
            for(int j = (i / 2) + 1; j > 0; j--) {
                System.out.print("* ");
            }
        
        }
        else {
            for(int j = 0; j < (n + 1) - (i / 2); j++){
                System.out.print("* ");
            }
        }
        System.out.println();
        
    }

  
    }
}
