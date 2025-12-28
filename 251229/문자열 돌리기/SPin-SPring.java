import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        System.out.println(str);

        String result = "";
        for(int i = 1; i <= len; i++) {
            result = str.substring(len-i, len) + str.substring(0, len-i);
            System.out.println(result);
        }

    }
}
