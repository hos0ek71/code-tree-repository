import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc= new Scanner(System.in);
    String str = sc.next();
    
    int len = str.length();
    for(int i =0; i < len; i++) {
        if(str.charAt(i) == 'e') {
            String result= str.substring(0,i) + str.substring(i+1);
            System.out.println(result);
            break;
        }
    }
    }
}