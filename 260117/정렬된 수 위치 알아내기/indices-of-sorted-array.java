import java.util.Scanner;
import java.util.Arrays;

class Number implements Comparable<Number> {
    int val, idx;
    public Number(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }

    @Override
    public int compareTo(Number other) {
        return this.val - other.val; // 오름차순
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number[] nums = new Number[n];
        int[] nums_move_pos= new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = new Number(sc.nextInt(), i); // 값과 원래 위치(i) 저장
        }

        Arrays.sort(nums); 

   
        for(int i = 0; i < n; i++) {
            nums_move_pos[nums[i].idx] = i + 1; // 보통 등수는 1부터 시작하므로 i + 1
        }

        for(int value : nums_move_pos) {
            System.out.print(value + " ");
        }
    }
}