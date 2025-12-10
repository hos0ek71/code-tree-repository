import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] array = new int[N];

    for(int i = 0; i < N; i++){
      array[i] = sc.nextInt();
    }

    int i = 0;
    while(i < N) {
        if(array[i] % 2 != 0 && array[i] % 3 == 0 ) {
            System.out.println(array[i]);
        }
        i++;
    }

    

    }
}