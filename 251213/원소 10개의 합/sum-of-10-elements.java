import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[10];

    for(int i = 0; i < arr.legnth; i++) {
        arr[i] = sc.nextInt();
    }

    for(int i = 0; i < arr.legnth; i++) {
        System.out.print(arr[i] + " ");
    }
    }
}