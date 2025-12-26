import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int maxVal = -99999;
    int minVal = 99999;

    for(int i = 0; i < 3; i++){
        String str = sc.next();
        if(str.length() > maxVal) maxVal = str.length();
        if(str.length() < minVal) minVal = str.length();
    }   

    System.out.print(maxVal - minVal);
    
    }
}