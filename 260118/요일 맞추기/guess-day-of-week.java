import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekDay = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        // 1️⃣ m1, d1 → 누적 일수
        int day1 = d1;
        for (int i = 1; i < m1; i++) {
            day1 += month[i];
        }

        // 2️⃣ m2, d2 → 누적 일수
        int day2 = d2;
        for (int i = 1; i < m2; i++) {
            day2 += month[i];
        }

        // 3️⃣ 날짜 차이
        int diff = day2 - day1;

        // 4️⃣ 요일 계산 (음수 보정)
        int idx = ((diff % 7) + 7) % 7;
    

        // 5️⃣ 출력
        System.out.println(weekDay[idx]);
    }
}