import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[99];
    int i = 0;

    while(true) {
        int N = sc.nextInt();
        arr[i] = N;
        if(arr[i] == 0) break;
        
        i++;
    }

    for(int arrs: arr) {
        if(arrs == 0) break;
        
        if(arrs % 2 == 1 ) {
            System.out.print(arrs + 3 + " ");
        }
        else if(arrs % 2 == 0 ) {
            System.out.print(arrs / 2 + " ");
        }
        else {
            System.out.print(arrs + " ");
        }
        

    }




    }
}