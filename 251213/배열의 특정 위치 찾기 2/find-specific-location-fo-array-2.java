import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    int odd = 0;
    int even = 0;

    for(int i = 0; i < 10; i++) {
        arr[i] = sc.nextInt();
        if(i == 0 || i % 2 == 0 ) {
            odd += arr[i];
        }
        else {
            even += arr[i];
        }
    }

    int result = 0;
    if(odd >= even) {
         result = odd - even;
    }
    else {
        result = even - odd;
    }

    System.out.print(result);
    }
}