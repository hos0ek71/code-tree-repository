import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[99];

    arr[0] = 1;
    arr[1] = N;

    for(int i = 2; i < 102; i++) {
        arr[i] = arr[i - 2] + arr[i - 1];
        if(arr[i] > 100) break;
    }

    for(int values: arr) {
        if(values == 0) break;
        System.out.print(values + " ");
        
    }
    

    }
}