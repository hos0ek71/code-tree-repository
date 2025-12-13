import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    
    int sum = 1;
    int i = 1;
    int[] arr = new int[100];
    int count = 0;

    while(true) {
        sum = N * i;
        arr[i] = sum;
        if(sum % 5 == 0) {
            count++;   
        }
        if(count == 2) break;
        i++;
    }

    for(int value : arr) {
        if(value != 0) {
            System.out.print(value + " ");
        }
    }
    

    

    }
}