import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);

    String[] arr = new String[10];

    for(int i = 0; i < 10; i++) {
        arr[i] = sc.next();
        if(i == 1){
            System.out.print(arr[i] + " ");
        }
        if(i == 4) {
            System.out.print(arr[i]+ " ");
        }
        if(i == 7) {
            System.out.print(arr[i] + " ");
        }

    }

 
    }
}