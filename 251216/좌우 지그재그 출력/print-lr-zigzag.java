import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int count = 1;
    for(int i = 1; i <= n; i++) {
        
        if(i % 2 == 1) {
            for(int j = 1; j <= n; j++){
                System.out.print(count + " ");
                count++;
            }
        }
        else {
            for(int j = n; j > 0; j--){
                count--;
                System.out.print(count + " ");
            }
        }
    System.out.println();
    count += 3;
    }
    }
}