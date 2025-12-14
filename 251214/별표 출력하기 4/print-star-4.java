import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = N;
    int count = 0;

    for(int i = (N * 2)-1; i > 0; i--) {
        for(int j = cnt; j > 0; j--){
            System.out.print("*");
            
        }

    count++;
    if(count >= N) cnt++;
        
    else cnt--;
    System.out.println();
    

    

    }
    }
}