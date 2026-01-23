import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            for (int j = A; j <= B; j++ ) {
                arr[j] += 1;
            }
        }

        int maxNum = Integer.MIN_VALUE;

        for (int value : arr){
            if (value > maxNum)
                maxNum = value;
        }
        
        System.out.println(maxNum);
        







        // Please write your code here.
    }
}