import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
   String str = sc.nextLine();
   String str2 = sc.nextLine();

    String[] arr = str.split(" ");
    String[] arr2 = str2.split(" ");

    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i]);
    }
    for(int i = 0; i < arr2.length; i++){
        System.out.print(arr2[i]);
    }
    






    }
}