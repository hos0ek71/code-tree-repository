import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while(true) {
            int nameNum = sc.nextInt();
            if(nameNum == 1) {
                System.out.println("John");
            }
            else if(nameNum == 2) {
                System.out.println("Tom");
            }
            else if(nameNum == 3) {
                System.out.println("Paul");
            }
            else if(nameNum == 4) {
                System.out.println("Sam");
            }
            else {
                System.out.println("Vacancy");
                break;
            }

        }
    }
}