import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String str = sc.next();
    int len = str.length();
    String str1 = str.substring(0, 1), str2 = str.substring(2, len - 2), str3 = str.substring(len-1);

    String result= str1+str2+str3;
    System.out.print(result);
    }
}