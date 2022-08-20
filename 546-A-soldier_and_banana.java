https://codeforces.com/problemset/problem/546/A
import java.util.Scanner;
public class soldireandbanana{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w  = sc.nextInt();
        int total_cost = 0;
        for (int i = 1; i <=w; i++) {
            total_cost +=(i*k);
        }
        int res = n - total_cost;
        if(res>=0){
            System.out.println("0");
        }
        else{
            System.out.println(-1*res);
        }
    }
}
