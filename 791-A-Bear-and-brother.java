https://codeforces.com/problemset/problem/791/A
import java.util.Scanner;
public class bear_and_brother{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w1 = sc.nextInt();
        int w2 = sc.nextInt();
        int year = 0;
        while(w1 <= w2){
            w1 = w1*3;
            w2 = w2*2;
            year++;
        }
        System.out.println(year);;
    }
}
