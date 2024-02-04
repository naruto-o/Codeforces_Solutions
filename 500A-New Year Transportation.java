import java.util.Scanner;
 
public class newyeartransport {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int c[] = new int[n];
    
    for (int i = 0; i < n-1; i++) {
        c[i] = sc.nextInt();
    }

    int pointer = t - 1;
    int sum = 0;
    for (int i = 0; i < t - 1; i+=c[i]) {
        sum += c[i];
    }

    if (sum == pointer) {
        System.out.println("yes");
    } else {
        System.out.println("no");
    }
}
}
