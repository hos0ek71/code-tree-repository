import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // Please write your code here.

        int maxNum = Integer.MIN_VALUE;
        int cnt = 1; 
        for (int i = 0; i < n-1; i++){
            
            if ( (arr[i] > 0 && arr[i+1] > 0) || (arr[i] < 0 && arr[i+1] < 0) )
                cnt++;
            else {
                cnt = 1;
            }
            if (cnt > maxNum)
                maxNum = cnt;
        }

        System.out.println(maxNum);


    }
}