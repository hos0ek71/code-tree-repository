public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 18;
        int num2 = (b - a)/2 + 1;
        int i = 0;

        int[] arr = new int[num2];

        while(i < num2) {
            if(i == 0 ){
                a= a + 0;
            }
            else {
                a = a + 2;
            }
            arr[i] = a;
            i++;
        }

        for(int j = 0; j <= 5; j++) {
            System.out.println(arr[j]);
        }

        // for(int i = 1; i <= 9; i++) {
        //      for(int j = num; j > 0; j--) {
        //          System.out.print(num[i-1]);
        //      }
        //  }
    }
    // public static int gcd(int a, int b) {      // 🔧 변경
    // int i = 0;
    //     while (b != 0) {
    //         int tmp = a % b;
    //         a = b;
    //         b = tmp;

    //     }
    //     return a;
    // }

    
}