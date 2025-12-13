import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[99];

    arr[0] = sc.nextInt();
    arr[1] = sc.nextInt();

    for(int i = 2; i < 10; i++) {
        arr[i] = arr[i - 1] + (arr[i - 2] * 2);
        
    }

    for(int values : arr) {
        if(values == 0) break;
        System.out.print(values + " ");
        
    }
    }
}