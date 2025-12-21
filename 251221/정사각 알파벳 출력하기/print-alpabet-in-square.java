import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num = 65+n;
        for(int i = 0; i < n; i++) {
            for(int j = num - n; j < num; j++){
                System.out.print((char)j);
            }
            num += n;
            System.out.println();
        }
    }
}