import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    
    
    int[] arr = new int[10];

    for(int i = 0; i < 10; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.print(arr[3 - 1] + arr[5 -1] + arr[10-1]);
    }
}