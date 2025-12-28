import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[] arr = S.toCharArray();
    int len = S.length();
    int Q = sc.nextInt();
    sc.nextLine();

    for(int i = 0; i < Q; i++) {
        int N = sc.nextInt();
        if(N == 1) {
            
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();
            char temp = arr[q2 -1];
            arr[q2 -1] = arr[q1 - 1];
            arr[q1 - 1] = temp;
            System.out.println(String.valueOf(arr));
        }
        else if(N == 2) {
            char q1 = sc.next().charAt(0);
            char q2 = sc.next().charAt(0);
            for(int k =0; k < len; k++){
                if(arr[k] == q1) arr[k]= q2;
            }
            System.out.println(String.valueOf(arr));

        }
      
    
    }
    
   

    }
}