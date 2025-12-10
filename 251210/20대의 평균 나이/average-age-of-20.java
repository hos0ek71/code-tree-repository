import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int sum = 0;
    while(true) {
        int age = sc.nextInt();
          if( age / 10 != 2) {
            break;
        }
        sum += age;
        count++;
      
        
    }

    double avg = (double) sum / count;
    System.out.printf("%.2f", avg);

    }
}