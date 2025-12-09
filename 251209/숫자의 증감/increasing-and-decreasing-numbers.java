import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    String C = sc.next();
    int N = sc.nextInt();

    if(C.charAt(0) == 'A') {
        for(int i = 1; i <= N; i++){
            System.out.print(i + " ");
        }
    }
    else if(C.charAt(0) == 'D'){
        for(int i = N; i >= 1; i--){
            System.out.print(i + " ");
        }
    }

    }
}