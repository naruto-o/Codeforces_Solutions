import java.util.Scanner;

public class bearandbigbrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =0;
        if(a>=b){
            System.out.println("0");
        }
        else{
            while(a<=b){
                a =a*3;
                b=b*2;
                c++;
            }
        }
        System.out.println(c);
    }
}
