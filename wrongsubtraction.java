import java.util.Scanner;

public class wrongsubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        while(k-->0){
            if(n%10 != 0){
                n=n-1;
            }
            else{
                n = n/10;
            }
        }
        System.out.println(n);
    }
}
