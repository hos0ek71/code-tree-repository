import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();
    int cnt = 0;
    


    for(int j = start; j <= end; j++){
    
    int sum = 0;
    int i = 1;

        while(i < j) {
        if(j % i == 0) {
            sum += i;
        }
            i++;
        }
        if(sum == j) cnt++;
    }

    System.out.println(cnt);
    

    }
}