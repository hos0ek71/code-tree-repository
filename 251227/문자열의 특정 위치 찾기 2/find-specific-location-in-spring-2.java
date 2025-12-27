import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String []{"apple", "banana", "grape", "blueberry", "orange"};
        char n = sc.next().charAt(0);
        int cnt = 0; 

        for(int i = 0; i < arr.length; i++){
            
            if (arr[i].charAt(2) == n || arr[i].charAt(3) == n){
                System.out.println(arr[i]);
                cnt++;
            }             
        }
        System.out.println(cnt);
    }
}