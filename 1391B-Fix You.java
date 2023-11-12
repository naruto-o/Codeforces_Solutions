import java.util.Scanner;
 
public class FixYou {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int x = 0;
            int y = 0;
            int n = s.nextInt();
            int m = s.nextInt();
            char arr[][] = new char[n][m];
 
            for (int i = 0; i < n; i++) {
                String row = s.next();
                for (int j = 0; j < m; j++) {
                    arr[i][j] = row.charAt(j);
                }
            }
 
            for (int i = 0; i < m; i++) {
                if (arr[n - 1][i] == 'D') {
                    x++;
                }
            }
 
            for (int j = 0; j < n; j++) {
                if (arr[j][m - 1] == 'R') {
                    y++;
                }
            }
 
            int c = x + y;
            System.out.println(c);
        }
    }
}
