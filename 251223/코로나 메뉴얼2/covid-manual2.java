import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        for(int i = 0; i < 3; i++){

            String sym = sc.next();
            int tem = sc.nextInt();

            if(sym.charAt(0) == 'Y' && tem >= 37 ) arr[0]++;
            else if(sym.charAt(0) == 'N' && tem >= 37) arr[1]++;
            else if(sym.charAt(0) == 'Y' && tem < 37) arr[2]++;
            else if(sym.charAt(0) == 'N' && tem < 37) arr[3]++;
            
        }

        for(int i = 0; i < 4; i++){
            System.out.print(arr[i] + " ");
            
        }
        if(arr[0] >= 2) {System.out.print("E");
        }
        

    }
}