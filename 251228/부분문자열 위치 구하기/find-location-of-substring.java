import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String tar = sc.nextLine();

    int len = str.length();

    for(int i = 0; i < len-1; i++){
        if(str.substring(i, i+2).equals(tar)) {
        System.out.print(str.indexOf(tar));
        break;
        }
    }
// tar가 str 안에 존재하지 않으면 -1을 출력
if (str.indexOf(tar) == -1) {
    System.out.print(-1);
}
    }
}