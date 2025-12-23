import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);

    int[] throwTen = new int[10];
    int[] countArr = new int[7];

    for(int i = 0; i < 10; i++){
        throwTen[i] = sc.nextInt();
    }


    for(int i = 0; i < 10; i++ ){
        countArr[throwTen[i]]++;
    }

     for(int i = 1; i <= 6; i++){
         System.out.println(i + " - " + countArr[i]);
     }

    }
}