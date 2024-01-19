import java.util.Scanner;
 
public class buttons{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 0; i <n; i++) {
            c += (i+1)*(n-i)-i;
        }
        System.out.println(c);
    }
}
