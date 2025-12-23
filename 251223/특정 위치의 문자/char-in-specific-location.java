import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] word = new char[] {'L', 'E', 'B', 'R', 'O', 'S'};

        int idx = -1;
        char input = sc.next().charAt(0);
        
        for(int i = 0; i < 6; i++){
            if(word[i] == input) {
                idx = i;
            }
        }

        if (idx == -1) {
            System.out.println("None");
        }
        else {
            System.out.println(idx);
        }

    }
}