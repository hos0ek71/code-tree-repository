import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    
    int[] arr = new int[100];
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int result = 0;

    while(A > 1) {
        
        A = A / B;
        result = A % B;
        arr[result]++;
    }

    int sum = 0; 

    for(int i = 0; i < 100; i++){
        if(arr[i] > 0) {
            sum += arr[i]*arr[i];
        }
    }
    System.out.print(sum);


    }
}