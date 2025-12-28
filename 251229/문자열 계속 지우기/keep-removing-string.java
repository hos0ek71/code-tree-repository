import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        int len = B.length();
        boolean val = true;
        
        while(val) {
            if(A.contains(B)) {
             int start = A.indexOf(B);
             int end= start + B.length();
             A = A.substring(0,start) + A.substring(end);

            }
            else {
                val = false;
            }
        }
        System.out.print(A);

    }
}