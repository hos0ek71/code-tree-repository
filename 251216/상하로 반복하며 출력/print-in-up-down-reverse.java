import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++) {
        
        int count = i;
        int count2 = n-i+1;

        for(int j = 0; j < n; j++) {
            if(j % 2 ==0) {
                System.out.print(count);
            }
            else {
                System.out.print(count2);
            }
        }

        
        System.out.println();
    }

    }
}