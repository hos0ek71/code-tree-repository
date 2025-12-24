import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int INT_MAX= Integer.MAX_VALUE;
    int N = sc.nextInt();
    int[] arr = new int[N];

    int minVal = INT_MAX;
    int cnt = 0;

    for(int i = 0; i < N; i++){
        arr[i] = sc.nextInt();
        if(arr[i] < minVal) {
            minVal = arr[i];
            cnt++;
        }
    }
    System.out.print(minVal + " " + cnt);




    }
}