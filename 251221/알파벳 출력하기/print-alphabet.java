import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num = 65;

    for(int i = 0; i < n; i++) {
        num = num+i;

        for(int j =0; j <= i;  j++){
            if((j+num) > 90 ){
                num = 65-j;
            }
            System.out.print((char)(j+num));
            
        }
        System.out.println();
        
    }
    }
}