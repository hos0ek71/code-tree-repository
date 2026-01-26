import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Please write your code here.
        final int OFFSET = 1000000; 
        int timeA = 0;
        int cur = OFFSET;
        int[] arrA = new int[2000001];

        for (int i = 0; i < n; i++){
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();

            if (direction=='R'){
                for (int j = 0; j < distance; j++){
                    timeA++;
                    cur++;
                    arrA[timeA] = cur;
                }

            }
            else {
                for (int j = 0; j < distance; j++){
                    timeA++;
                    cur--;
                    arrA[timeA] = cur;
                }
            }    
        }

        int timeB = 0;
        cur = OFFSET;
        int[] arrB = new int[2000001];
        for (int i = 0; i < m; i++){
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();

            if (direction == 'R'){
                for (int j = 0; j < distance; j++){
                    timeB++;
                    cur++;
                    arrB[timeB] = cur;
                }
            }
            else {
                for (int j = 0; j < distance; j++){
                    timeB++;
                    cur--;
                    arrB[timeB] = cur;
                }
            }
        }

        for (int i = 0; i < 2000001; i++){
            if (i != 0 && arrA[i] == arrB[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}