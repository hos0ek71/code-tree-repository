import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);

    int i = 1; 
    int cnt3 = 0;
    int cnt5 = 0; 

    while(i <= 10){
        int A = sc.nextInt();
        if(A % 3 == 0)
        cnt3++;
        if(A% 5 == 0)
        cnt5++;
        i++;
    }
    
    System.out.print(cnt3 + " " + cnt5);
    }
}