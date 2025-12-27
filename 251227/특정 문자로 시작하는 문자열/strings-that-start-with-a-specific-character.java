import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    String[] arr = new String[N];

    for(int i =0; i < arr.length; i++){
        arr[i]= sc.nextLine();
    }
    
    char A = sc.next().charAt(0);
    int cnt = 0; 
    int sum = 0; 
    for(int i = 0; i < arr.length; i++){
        if(arr[i].charAt(0) == A) {
            sum += arr[i].length();
            cnt++;
        }
    }

    System.out.printf("%d %.2f", cnt , (double) sum/cnt);
    
    }
}