import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    String n = sc.next();
    int cnt = 0;

    for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == 'e') cnt++;
    }

    System.out.print(cnt);
    }
}