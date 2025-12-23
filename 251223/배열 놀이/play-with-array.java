import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int Q = sc.nextInt();

    int[] arr = new int[N+1];

    for(int i = 1; i <= N; i++){
        arr[i] = sc.nextInt();
    }

    for(int play = 1; play <= Q; play++){

        int anser = sc.nextInt();
        int count = sc.nextInt();

        if(anser == 1) {
            System.out.println(arr[count]);
        }
        else if(anser == 2){
            int idx = -1;
            for(int i = N; i >= 0; i--){
              if(arr[i] == count) {
                idx = i; 
                }
            }
            System.out.println(idx == -1 ? 0 : idx);
        }
        else if(anser == 3) {
            int three = sc.nextInt();
            for(int i = count; i <= three; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }



    }
}