https://codeforces.com/problemset/problem/50/A
import java.util.Scanner;

public class domino_piling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m  = sc.nextInt();
        int n = sc.nextInt();
        int c = m *n;
        int d = c /2;
        System.out.println(d);
    }
}
