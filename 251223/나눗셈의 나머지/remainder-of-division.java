public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    
    int[] arr = new int[100];

    int A = 1000;
    int B = 4;
    int result = 0;

    while(A > 1) {
        
        A = A / B;
        System.out.println(A);
        result = A % B;
        arr[result]++;
    }

    for(int i = 0; i < 100; i++){
        if(arr[i] > 0) {
            sum = i * i;

        }
    }


    }
}