import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    char cnt = 'A';
    for(int i = n; i > 0; i--) {
        for(int j = n; j > 0; j--){
            
            if(i < j){
                System.out.print("  ");
            }
            else {
                System.out.print(cnt + " ");
                cnt++;
            }
            if(cnt > 'Z'){
                cnt = 'A';
            }
            
        
        }
        System.out.println();
    }
    }
}