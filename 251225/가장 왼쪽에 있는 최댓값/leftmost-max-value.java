import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int maxVal;
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N+1];

    for(int i = 1; i <= N; i++ ){
        arr[i] = sc.nextInt();
    }


    int end = N;
    int idx;
    while(end >= 1) {
        maxVal = -279999;
        idx = -1;

        for(int i = 1; i <= end; i++){
            if(arr[i] > maxVal) {
                maxVal = arr[i];
                idx = i;
            }        
        }
        System.out.print(idx + " ");
        end = idx - 1;
    }
 
        
    }
}
    

