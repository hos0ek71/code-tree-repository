import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();
    int result = 0; 

    for(int j = start; j <= end; j++){

        int cnt = 0;
        int i = 1;

        while(i <= j) {
          if(j % i == 0) cnt++;
          i++;
        }
        
        if(cnt == 3) result++;

    }

    System.out.println(result);

    

    }
}