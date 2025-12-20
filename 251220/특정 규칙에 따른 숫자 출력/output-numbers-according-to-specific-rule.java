import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 1;
    for(int i = n; i > 0; i--){
        for(int j = n; j > 0; j--){
            if(j > i) {
                System.out.print("  ");
            }
            else {
                System.out.print(cnt + " ");
                cnt++;
            }
            if(cnt >= 10) cnt = 1;
        }
        System.out.println();
    }
    
    
    }
}