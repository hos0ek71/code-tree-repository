import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char str1 = sc.next().charAt(0);
        char str2 = sc.next().charAt(0);

        int sum = (int)str1 + (int)str2;

        int min;

        if(str1 >= str2){
             min = (int)str1 - (int)str2;
        }
        else{min = (int)str2 - (int)str1;}

        System.out.println(sum + " " +min);


    }
}