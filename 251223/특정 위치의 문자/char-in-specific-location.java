public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        char[] word = new char[] {'L', 'E', 'B', 'R', 'O', 'S'};

        int idx = -1;

        for(int i = 0; i < 6; i++){
            if(word[i] == sc.nextInt()) {
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