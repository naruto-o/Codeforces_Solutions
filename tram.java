import java.util.Scanner;

public class tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int max = 0;
        int c = 0;
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            c -= a;
            c+=b;
            if(c>max){
                max = c;
            }
        }
        System.out.println(max);
    }
}
