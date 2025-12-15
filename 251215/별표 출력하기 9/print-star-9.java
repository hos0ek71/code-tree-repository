
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    int n = 3;
    for(int i = 0; i < n; i++) {
        for(int k = 0; k < 2 - i; i++){
            System.out.print(" ");
        }

        for(int l = k; l < (2 * i) + 1; i++) {
            System.out.print("*");
        }

    }    
    }
}