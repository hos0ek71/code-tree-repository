import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) return; // 첫 줄 입력 확인
        String str = sc.nextLine();
        String result = str;

        // 숫자가 있고 문자열 길이가 1보다 클 때만 실행
        while (result.length() > 1 && sc.hasNextInt()) { 
            int N = sc.nextInt();
            
            if (N > 0 && N < result.length()) {
                String str1 = result.substring(0, N);
                String str2 = result.substring(N + 1);
                result = str1 + str2;
            } else if (N >= result.length()) {
                result = result.substring(0, result.length() - 1);
            } else { // N <= 0 인 경우
                result = result.substring(1);
            }
            
            System.out.println(result);
        }
        sc.close();
    }
}