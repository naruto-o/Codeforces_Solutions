import java.util.Scanner;

public class donutshops {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
         while(t-->0){
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
           if(a<c){
            System.out.print("1"+" ");
           }else{
            System.out.print("-1"+" ");
           }
           if(a*b>c){
            System.out.print(b);
           }else{
            System.out.print("-1");
           }
           System.out.println();
        }
    }
}
