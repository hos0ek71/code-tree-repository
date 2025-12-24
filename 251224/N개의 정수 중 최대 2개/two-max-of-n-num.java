import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int maxVal = Integer.MIN_VALUE;
        int secondVal = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[2];

        for(int i = 0; i < N; i++){
            
            int A = sc.nextInt();
            if(A > maxVal) {
                secondVal = maxVal;
                maxVal = A;
            }
            else{
                if(A > secondVal) {
                    secondVal = A ;
                }
            }
        }
        System.out.printf("%d %d", maxVal, secondVal);


    }
}