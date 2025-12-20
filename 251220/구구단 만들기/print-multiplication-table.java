import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

     
        int num2 = (b - a)/2 + 1;
        int i = 0;

        int[] arr = new int[num2];

        while(i < num2) {
            if(i == 0 ){
                a= a + 0;
            }
            else {
                a = a + 2;
            }
            arr[i] = a;
            i++;
        }

         for(int k = 1; k <= 9; k++) {
              for(int j = num2; j > 0; j--) {
                  System.out.print(arr[j-1] + " " + "*" + " " + k + " " + "=" + " " + arr[j-1] * k + " ");
                  if(j != 1)
                  System.out.print("/" + " ");
              }
              System.out.println();
          }
    }
    // public static int gcd(int a, int b) {      // 🔧 변경
    // int i = 0;
    //     while (b != 0) {
    //         int tmp = a % b;
    //         a = b;
    //         b = tmp;

    //     }
    //     return a;
    // }

    
}