import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] arr = new int[11];

        arr[1] = A;
        arr[2] = B;

        for(int i = 3; i < 11; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            if(arr[i] % 10 != 0) {
                arr[i] = arr[i] % 10;
            }
        }
        for(int i = 1; i < 11; i++) {
            System.out.print(arr[i] + " ");
        }
        

        
    }
}