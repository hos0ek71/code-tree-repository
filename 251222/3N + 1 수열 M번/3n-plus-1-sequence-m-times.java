import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            int count = sc.nextInt();
            int cnt = 0;
            while(count > 1) {
                if(count % 2 == 0){
                    count = count / 2;
                    cnt++;
                }
                else {
                    count = (count * 3) + 1;
                    cnt++;
                }
            }
            System.out.println(cnt);


        }
        
    }
}