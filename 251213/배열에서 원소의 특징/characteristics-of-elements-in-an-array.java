import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    int[] arr = new int[10];
    Scanner sc = new Scanner(System.in);

    for(int i = 0; i <10; i++) {
        arr[i] = sc.nextInt(0;)
        if(arr[i] % 3 == 0) {
            System.out.println(arr[i]);
            break;
        }
    }

    }
}