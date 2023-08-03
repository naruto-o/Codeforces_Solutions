import java.util.Scanner;

public class softdrink {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //  n, k, l, c, d, p, nl, np,
        int n = s.nextInt();
        int k = s.nextInt();
        int l = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int p = s.nextInt();
        int nl = s.nextInt();
        int np = s.nextInt();
       int total_drink = (k*l)/nl;
       int total_lime = c*d;
       int total_salt = p/np;
        int toast =Math.min(total_lime, total_salt);
        int ans = Math.min(toast,total_drink)/n;
        System.out.println(ans);
    }
}
