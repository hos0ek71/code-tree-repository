import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();

        String result =  str.substring(1,len) + str.substring(0,1);
        System.out.print(result);
    }
}