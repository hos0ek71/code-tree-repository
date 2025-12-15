public class Main {
    public static void main(String[] args) {
    
     int n = 4;
    int count = 0;

      for(int i = 0; i < (n*4) -3; i++) {
        if(i % 2== 0){
            count++;
            for(int j = 0; j < count; j++){
            System.out.print("*");
            if(count > n) count--;
        }
        }
        else System.out.println("\n");
        
       
      }
    }
}