import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int leng = (b - a) + 1;
    for(int i = 1; i <= 4; i++){
        for(int j = 0; j < leng; j++){
            System.out.print( (b-j) + " " + "*" + " " + (i*2) + " " + "=" + " " + (b-j) * (i*2) + " ");
            if(j  != leng-1)
            System.out.print("/" + " ");
        }
    System.out.println();

    }
    }
}