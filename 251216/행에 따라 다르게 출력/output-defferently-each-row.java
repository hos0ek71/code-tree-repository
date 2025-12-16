import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanenr sc= new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    
    for(int i = 1; i <= n; i++) {
        if(i % 2 == 1){
            for(int j = 1; j <= n; j++){
                count++;
                System.out.print(count + " ");
                
            }
        }
        else {
            for(int j = 1; j <= n; j++){
                count+= 2;
                System.out.print(count + " ");
            }
        }
        System.out.println();
        
    }
    }
}