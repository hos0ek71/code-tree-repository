import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int INT_MIN = Integer.MIN_VALUE;
        final int INT_MAX = Integer.MAX_VALUE;

        int minVal = INT_MAX;
        int maxVal = INT_MIN;

        while (true) {
            int num = sc.nextInt();

            if (num == 999 || num == -999) {
                break;   // 종료
            }

            if (num > maxVal) {
                maxVal = num;
            }

            if (num < minVal) {
                minVal = num;
            }
        }

        System.out.printf("%d %d", maxVal, minVal);
    }
}