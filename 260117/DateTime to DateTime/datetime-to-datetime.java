import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int min = sc.nextInt();
        // Please write your code here.

        int startTime = ((11 * 24) * 60) + (11 * 60) + 11;

        int day = (A * 24) * 60;
        int hour = B * 60;
        int targetTime = day + hour + min;
        int elapsedTime = 0;

        while(true) {

            if (startTime == targetTime) 
                break;

            elapsedTime++;
            startTime++;

        }

        System.out.println(elapsedTime);
    


    }
}