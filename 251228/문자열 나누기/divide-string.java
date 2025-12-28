import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
    int N = sc.nextInt();
    String result = "";
    sc.nextLine();
    String str = sc.nextLine();
    int cnt = 0; 
    int a = 0; 
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == ' ') continue;
      result += str.charAt(i);
      cnt++;
      if(cnt != 0 && cnt % 5 == 0) {
        System.out.println(result);
        result = "";
        a++;
      }
    }
    

    System.out.println(a);


    }
}