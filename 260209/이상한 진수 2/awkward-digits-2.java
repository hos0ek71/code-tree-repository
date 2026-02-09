import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int maxN = 0;
        // 1. 수정을 위해 문자 배열로 변환합니다.
        char[] charArray = a.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char original = charArray[i]; // 원래 문자를 저장해둡니다.

            // 2. 비트를 반전시킵니다.
            if (charArray[i] == '1') {
                charArray[i] = '0';
            } else {
                charArray[i] = '1';
            }

            // 3. 배열을 다시 문자열로 바꾸고, 2진수 정수로 변환합니다.
            String newA = new String(charArray);
            int numA = Integer.parseInt(newA, 2);

            // 4. 최댓값을 갱신합니다.
            maxN = Math.max(numA, maxN);

            // 5. 다음 루프를 위해 원래대로 되돌려 놓습니다.
            charArray[i] = original;
        }

        System.out.println(maxN);
    }
}