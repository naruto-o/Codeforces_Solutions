import java.util.Scanner;

public class boringapartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int digit = n%10;
            int res =0;
            res = (digit-1)*10;
            int num = digit;
            int i = 1;
            while(num<=n){
                res+=(i++);
                num = num*10+digit;
            }
            System.out.println(res);
        }
        
    }
}
