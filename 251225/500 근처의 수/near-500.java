import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int maxVal = -29999999;
    int minVal = 29999999;
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];

    for(int j = 0; j < 10; j++){
        arr[j] = sc.nextInt();
    }

    int i = 0; 
    while(i < 10) {
        if(arr[i] < 500) {
            if(arr[i] > maxVal) maxVal = arr[i];
        }
        else {
            if(arr[i] < minVal) minVal = arr[i];
        }
        i++;
    }
    
    System.out.printf("%d %d", maxVal, minVal);

    }
}