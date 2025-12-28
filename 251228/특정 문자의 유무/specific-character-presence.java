import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    boolean strEE = false;
    boolean strAB = false;
    for(int i = 0; i < str.length()-1 ; i++){
        if( str.substring(i,i+2).equals("ee") ) strEE = true;
        if( str.substring(i,i+2).equals("ab") ) strAB = true;
    }

    if(strEE) {System.out.print("Yes ");}
    else {System.out.print("No ");}
    if(strAB) {System.out.print("Yes ");}
    else {System.out.print("No ");}

    




    }
}