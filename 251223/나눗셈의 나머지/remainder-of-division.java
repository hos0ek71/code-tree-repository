import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    
    int[] arr = new int[100];
    Scanner sc = new Scanner(System.in);
    /*int A = sc.nextInt();
    int B = sc.nextInt(); */
    int A = 907;
    int B = 10;
    int result = 0;

    while(A > 1) {

        result = A % B;
        A = A / B;
        
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