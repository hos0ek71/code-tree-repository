import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 0; 

    for(int i = 0; i < N; i++) {
        int odd3 = sc.nextInt(); 
        if(odd3 % 2 == 1 && odd3 % 3 == 0) {
            sum = sum + odd3;
        }
    }
    System.out.print(sum);

    }
}