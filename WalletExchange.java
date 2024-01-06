import java.util.Scanner;

public class walletexchange{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int  a = sc.nextInt();
            int b = sc.nextInt();
            if(a == b){
               System.out.println("Bob");
               continue;
            }
             int c = Math.abs(a-b);
             if( c%2 == 0){
                System.out.println("Bob");
             }
             else{
                System.out.println("Alice");
             }
        }
    }
}
