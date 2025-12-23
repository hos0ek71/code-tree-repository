import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int N1 = sc.nextInt();
    int N2 = sc.nextInt();

    int[] arr1 = new int[N1];
    int[] arr2 = new int[N2];

    for(int i = 0; i < N1; i++){
        arr1[i] = sc.nextInt();
    }
    for(int i = 0; i < N2; i++){
        arr2[i] = sc.nextInt();
    }
    int cnt = 0; 
    
    
    for(int i = 0; i < N1; i++) {
        if(cnt == N2) break;
        if(cnt < N2 && arr1[i] == arr2[cnt]) cnt++;
        else cnt = 0;
        
        
        
    }

    System.out.println(cnt == N2 ? "Yes" : "No");




    

    }
}