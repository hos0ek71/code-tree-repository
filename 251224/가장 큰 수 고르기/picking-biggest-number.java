import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    final int INT_MIN = Integer.MIN_VALUE;
    int[] arr = new int[10];

    int maxVal = INT_MIN;
    for(int i = 0; i < 10; i++){
        int a = sc.nextInt();
        if(a > maxVal) maxVal = a;
    }
    System.out.print(maxVal);


    }
}