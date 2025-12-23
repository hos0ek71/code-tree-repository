import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int[] stu = new int[101];
    int[] score = new int[11];

    for(int i = 0; i < 101; i++){
        stu[i] = sc.nextInt();
        score[stu[i] / 10]++;
        if(stu[i] == 0) break;
    }

    for(int i = 10; i >= 1; i--){
        System.out.println(i * 10 + " - " + score[i]);
    }

 
    }
}