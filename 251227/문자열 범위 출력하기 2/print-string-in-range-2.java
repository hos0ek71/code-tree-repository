import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int num = sc.nextInt();
    int len = str.length();

    int stratIndex = len - num ;
    if(stratIndex <= 0 ) stratIndex = 0;

    for(int i = len-1; i >= stratIndex; i--){
        System.out.print(str.charAt(i));
    }
    }
}