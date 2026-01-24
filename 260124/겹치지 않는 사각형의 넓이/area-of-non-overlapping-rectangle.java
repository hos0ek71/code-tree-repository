import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 세 개의 사각형 좌표 입력 받기
        int ax1 = sc.nextInt(), ay1 = sc.nextInt(), ax2 = sc.nextInt(), ay2 = sc.nextInt();
        int bx1 = sc.nextInt(), by1 = sc.nextInt(), bx2 = sc.nextInt(), by2 = sc.nextInt();
        int mx1 = sc.nextInt(), my1 = sc.nextInt(), mx2 = sc.nextInt(), my2 = sc.nextInt();

        // 2. OFFSET 설정 및 배열 선언
        // 좌표 범위가 -1000 ~ 1000일 경우, 1000을 더해 0 ~ 2000 인덱스로 변환
        int OFFSET = 1000;
        int[][] arr = new int[2001][2001];

        // 3. 사각형 그리기 (나중에 그린 번호가 이전 번호를 덮어씌움)
        // 사각형 A (번호 1)
        for (int i = ax1 + OFFSET; i < ax2 + OFFSET; i++) {
            for (int j = ay1 + OFFSET; j < ay2 + OFFSET; j++) {
                arr[i][j] = 1;
            }
        }

        // 사각형 B (번호 2)
        for (int i = bx1 + OFFSET; i < bx2 + OFFSET; i++) {
            for (int j = by1 + OFFSET; j < by2 + OFFSET; j++) {
                arr[i][j] = 2;
            }
        }

        // 사각형 M (번호 3 - 마스크/덮개)
        for (int i = mx1 + OFFSET; i < mx2 + OFFSET; i++) {
            for (int j = my1 + OFFSET; j < my2 + OFFSET; j++) {
                arr[i][j] = 3;
            }
        }

        
        int minX = 2001, maxX = 0;
        int minY = 2001, maxY = 0;
        int cnt = 0; 

        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if (arr[i][j] == 1 || arr[i][j] == 2) { 
                    cnt++;
             
                }
            }
        }

        System.out.println(cnt);
    }
}