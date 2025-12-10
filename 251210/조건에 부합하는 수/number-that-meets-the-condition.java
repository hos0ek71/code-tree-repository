import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int i = 1; 


    while(i <= A) {
        if( (i % 2 == 0 && i % 4 != 0) || (i / 8) % 2 == 0 || (i % 7 < 4))  {
            i++;
            continue;
        }
        System.out.print(i + " ");
        i++;
    }

    }
}