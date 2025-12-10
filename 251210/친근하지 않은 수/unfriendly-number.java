import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int i = 1;  
    int cnt = 0;

    while(i <= N) {
        i++;
        if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
            continue;
        }
        cnt++;
    }
    System.out.print(cnt);
    }
}