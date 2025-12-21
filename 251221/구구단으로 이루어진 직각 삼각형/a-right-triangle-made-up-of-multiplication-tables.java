import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 1;
    for(int i = n; i >= 0; i--) {
        for(int j = 1; j <= i; j++){
            System.out.print(cnt + " * "+  j +  " = "  + cnt * j + " ");
            if(j < i) {
                System.out.print("/" +" ");
            }
            
        }   
        System.out.println();
        cnt++;
    }
    }
}