import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    String AB = str1+str2;
    String BA = str2+str1; 
    int cnt = 0; 
    for(int i = 0; i < AB.length(); i++){
        if((AB.charAt(i) != BA.charAt(i))) break;
        else{cnt++;}
    }

    System.out.print(cnt == AB.length() ? true : false);
    
    }
}