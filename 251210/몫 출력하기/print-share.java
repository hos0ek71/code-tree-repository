import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int count = 0; 
    
    while(true) {
        if(count == 3) break;
        int num = sc.nextInt();
        
        if(num % 2 == 1) {
            num = 0;
        }
        else if(num % 2 == 0) {
            System.out.println(num / 2);
            count++;
        }
    }
    }
}