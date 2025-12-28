import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String tar = sc.nextLine();

    int len = str.length();
    int cnt = 0; 
    for(int i = 0; i < len-1; i++){
        if(str.substring(i, i+2).equals(tar)) {
            cnt++;
        }
        
    }
    System.out.print(cnt);

    }
}