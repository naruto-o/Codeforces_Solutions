import java.util.Scanner;

public class diversesubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)!=str.charAt(i+1)){
                System.out.println("YES");
                System.out.println(str.substring(i,i+2));
                return;
            }
        }
        System.out.println("NO");
    }
}
