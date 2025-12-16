import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i = 0; i < 2*n +1; i++){
        for(int j = 0; j < 2*n +1; j++){
            if(i % 2 == 0 || (j % 2 == 0)){
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        }
        System.out.println();
    } 


    //     (2*n + 1)

    // 0열 짝수행일때는 무조건 * 하고
    // 홀수행이리대는 짝수열만 출력


    // 00 01 02 03 04
    // 10    12    14
    // 10 11 12 13 14
    // 20    22    24
    // 30 31 32 33 34
    }
}