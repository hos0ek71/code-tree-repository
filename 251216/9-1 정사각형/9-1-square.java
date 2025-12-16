import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 9;

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            if(count == 0) {count = 9;}
            System.out.print(count);
            count--;
        }
    System.out.println();
    }
    }
}