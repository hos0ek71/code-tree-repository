import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String tar = sc.nextLine();

        // indexOf는 존재하면 인덱스(0 포함)를, 없으면 -1을 반환합니다.
        // 루프를 돌릴 필요 없이 바로 출력하면 됩니다.
        System.out.print(str.indexOf(tar));
    }
}