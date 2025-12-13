import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    int count = 0;

    for(int i = 0; i < N; i++) {
        arr[i] = sc.nextInt();
        if(arr[i] % 2 == 0) {
            count++;
        }
    }

    int[] arr2 = new int[count];
    int idx = 0;

    for(int i = 0; i < N; i++) {
        if(arr[i] % 2 == 0) {
            arr2[idx++] = arr[i];
        }
    }

    for(int value : arr2) {
        System.out.print(value + " ");
    }
    

    }
}