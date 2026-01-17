import java.util.Scanner;
 

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.

        int min1 = a * 60 + b;
        int min2 = c * 60 + d;
        int elapsedTime = 0;

        while(true) {

            if(min2 == min1){
                break;
            }
            
            min1++;
            elapsedTime++;
        }

        System.out.println(elapsedTime);


    }

    
}