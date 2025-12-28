import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String result = str;
        String str1 = "";
        String str2 = "";
        while(result.length() > 1){
            int N = sc.nextInt();
            if(N > 0 && N < result.length()) {
                str1 = result.substring(0, N);
                str2 = result.substring(N+1);
                result = str1 + str2;
                System.out.println(result);
            }
            else if(N > result.length()) {
                str1= result.substring(0, result.length()-1);
                result = str1;
                System.out.println(result);
            }
            else {
                str1 = result.substring(1,result.length());
                result = str1;
                System.out.println(result);
            }
            
        }
    }
}