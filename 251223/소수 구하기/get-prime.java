import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    for(int n = 2; n <= input; n++){

        int cnt = 0;
        int i = 1;

        while(i <= n){
        if(n % i == 0) cnt++;  
        i++;
        }
        if(cnt == 2) System.out.print(n + " ");
    }
    

    }
}