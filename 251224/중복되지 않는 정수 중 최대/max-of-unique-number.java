import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int maxVal = Integer.MIN_VALUE;
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr= new int[N+1];
    int[] countArr = new int[1001];

    int idx = 0;

    for(int i = 1; i <= N; i++){
        arr[i] = sc.nextInt();
        countArr[arr[i]]++;
    }

    for(int i = 1; i <= 1000; i++) {
        if(countArr[i] == 1 ) {
            if( i > maxVal ) {
                maxVal = i;    
            }   
        }
    }

    System.out.print(maxVal > 0 ? maxVal : -1);

    }
}