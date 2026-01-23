import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [100];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for (int j = x1; j <= x2-1; j++){
                arr[j]++;
            }

        }

        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++){
            if ( arr[i] > maxNum )
                maxNum = arr[i];
        }

        System.out.println(maxNum);


        


        // Please write your code here.
    }
}