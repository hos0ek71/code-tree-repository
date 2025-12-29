import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int len = str.length();
    String dir = sc.nextLine();
    char[] arr = dir.toCharArray();

    String result = str;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == 'L') {
            result= result.substring(1, len) + result.substring(0, 1);
        }
        else if(arr[i] == 'R') {
            result = result.substring(len-1,len) + result.substring(0, len-1);
        }
    }
    
    System.out.println(result);
    }
}