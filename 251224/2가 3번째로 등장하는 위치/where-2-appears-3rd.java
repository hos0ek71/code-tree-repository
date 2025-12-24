import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt(); 
    int[] ele = new int[N+1];
    int idx = 0;

    for(int i = 1; i <= N; i++){
        ele[i] = sc.nextInt();
        if(ele[i] == 2) idx++;
        if(idx == 3){ 
            System.out.print(i);
            break;
            }
    }


    }
}