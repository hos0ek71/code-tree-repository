import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    int[] arr = new int[10];
    Scanner sc = new Scanner(System.in);
    int result = 0;

    for(int i = 0; i <10; i++) {
        arr[i] = sc.nextInt();
        
        if(arr[i] % 3 == 0) {
            System.out.println(arr[i-1]);
            break;
        }
        
        
    }

    }
}