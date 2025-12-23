import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];
        int i = 1; 
        int[] countArr = new int[10];

        int A = 1;
        while(A != 0){
            A = sc.nextInt();
            arr[i] = A;
            i++;
        }

        for(int j = 1; j <= 9; j++) {
         countArr[arr[j] / 10]++;
        }

        for(int j = 1; j <= 9; j++) {
            System.out.println(j + " - " + countArr[j]);
        }
        

        
    }
}