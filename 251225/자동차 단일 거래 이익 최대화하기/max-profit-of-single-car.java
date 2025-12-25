import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int minVal = Integer.MAX_VALUE;
    int maxVal = Integer.MIN_VALUE;

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr= new int[N];  
    
    for(int i = 0; i < N; i++){
        arr[i] = sc.nextInt();
    }

    int idx = -1;
    int j; 
    while(true) {

        for(int i = 0; i < 5; i++){
            if(arr[i] < minVal) minVal = arr[i];
            idx = i;
        }
        for(j = idx; j < N; j++){
            if(arr[j] > maxVal) maxVal = arr[j];  
        }
        if(j == N) break;
    }

    boolean result = (minVal == maxVal);
    System.out.println(result ? 0 : maxVal-minVal);
    
    }
}