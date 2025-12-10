import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int sum = 0;

    boolean AB = (A >= B);

    if(AB) {
        for(int i = B; i <= A; i++){
            if(B % 5 == 0){
                sum = sum + B;
            }
            B++;
        }
        System.out.print(sum);
    }
    else {
        for(int i = A; i <= B; i++){
            if(A % 5 == 0){
                sum += A;
            }
            A++;
        }
        System.out.print(sum);
    }

    

    }
}