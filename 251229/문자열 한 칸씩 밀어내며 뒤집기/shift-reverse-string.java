import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = sc.nextInt();
        sc.nextLine();
        
        int len = str.length();
        String result = str;
        for(int i =0; i < N; i++){
            int Q = sc.nextInt();
            if(Q == 1) {
                result = result.substring(1) + result.substring(0,1);
            }
            else if(Q == 2) {
                result = result.substring(len-1, len) + result.substring(0, len-1);
            }
            else if(Q == 3) {
                result = result.substring(len-1,len) + result.substring(len-2,len-1) + result.substring(len-3,len-2)+result.substring(len-4,len-3);
                
            }
            
            System.out.println(result);
        }
    }
}