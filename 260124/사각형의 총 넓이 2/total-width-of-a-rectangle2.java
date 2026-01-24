import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
        }

        int[][] arr = new int[201][201];
        int offset = 100;

        for (int i = 0; i < n; i++){
            int ax1= x1[i];
            int ay1 = y1[i];
            int ax2 = x2[i];
            int ay2 = y2[i];

            for (int j = ax1; j <= ax2-1; j++) {
                for (int k = ay1; k <= ay2-1; k++){
                    arr[j + offset][k + offset] = 1;
                }
            }
        }

        int cnt = 0;
        for (int j = 0; j < 201; j++) {
            for (int k = 0; k < 201; k++){
                if(arr[j][k] == 1) 
                    cnt++;
            }
        }
        System.out.println(cnt);
        

        
        // Please write your code here.
    }
}