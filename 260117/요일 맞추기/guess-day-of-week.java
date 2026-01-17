import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] weekDay = new String[] {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        String[] minusWeekDay = new String[] {"0","Sun","Sat","Fri","Thu","Wed","Tue","Mon"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int dis= Math.abs(d2) - Math.abs(d1);

        if (dis > 0)
            System.out.println(weekDay[dis]);
        else if (dis < 0)
            System.out.println(minusWeekDay[Math.abs(dis)]);
        else 
            System.out.println("Mon");

    }
}