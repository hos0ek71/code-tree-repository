import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    int sum2 = 0;
    int sum3 = 0;
    int count = 0;

    for(int i = 0; i < 10; i++) {
        arr[i] = sc.nextInt();

        if(arr[i] % 3 == 0) {
            sum3 += arr[i];
            count++;
        }
    }

    for(int i = 0; i < 10; i++) {
        if(i %  2 == 1)
        sum2 += arr[i];
    }

    System.out.print(sum2 +" " + ((double) sum3/count) );
    
    }
}