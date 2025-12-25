import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int minPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < N; i++) {
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
            minPrice = Math.min(minPrice, arr[i]);
        }

        System.out.println(maxProfit);
    }
}