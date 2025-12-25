import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] price = new int[N];

        for (int i = 0; i < N; i++) {
            price[i] = sc.nextInt();
        }

        int maxProfit = 0;
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++) {
                int profit =  price[j] - price[i];

                if(profit > maxProfit) maxProfit = profit;
            }
        }
        System.out.print(maxProfit);
    }
}