import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int i = 1;

    int tolit = 0;
    int corridor = 0;
    int classRoom = 0;

    while(i <= N) {
        if(i % 12 == 0) {
            tolit++;
        }
        else if(i % 3 == 0){
            corridor++;
        }
        else if(i % 2 == 0){
            classRoom++;
        }
        i++;
    }

    System.out.print(classRoom + " " + corridor + " " + tolit);
    }
}