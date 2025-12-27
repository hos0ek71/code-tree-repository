import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    String[] arr = new String[10];
    int sum = 0;

    for(int i = 0; i < 10; i++){
        arr[i]= sc.next();
        sum += arr[i].length();
    }

    System.out.print(sum);
    
    
    }
}