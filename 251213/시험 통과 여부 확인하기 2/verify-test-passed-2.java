import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] stu = new int[n];
    int[] arr = new int[n * 4];

    int sum = 0;
    int count = 0;
    int avg = 0;

    for(int i = 0; i < arr.length; i++) {

        arr[i] = sc.nextInt();
        sum += arr[i];
        count++;

        if(count == 4) {
            stu[i / 4] = sum / 4;
            sum = 0;
            count = 0;
        }

       
    }
    int passCount = 0;

    for(int i = 0; i < stu.length; i++) {
     
            if((stu[i]) >= 60) {
                System.out.println("pass");
                passCount++;
            }
            else {
                System.out.println("fail");
            }

    }
    System.out.println(passCount);
    
    }
}