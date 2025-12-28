import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int len = arr.length;
        arr[1] = 'a';
        arr[len-2]  ='a';

        System.out.print(String.valueOf(arr));
    }
}