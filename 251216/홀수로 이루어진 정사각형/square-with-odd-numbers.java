import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            System.out.print( (i * 2) + j*2  + 11 + " " );
        }
        System.out.println();
    }
    }
}


// 0,0 = 11 (2*i) + j + 11
// 0,1 = 13
// 0,2 = 15
// 0,3 = 17

// 1,0 = 13
// 1,1 = 15
// 1,2 = 17
// 1,3 = 19 


 
