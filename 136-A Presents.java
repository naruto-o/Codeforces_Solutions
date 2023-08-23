import java.util.Scanner;

public class presents {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n+1];
        for (int i = 1; i <=n; i++) {
            int k = s.nextInt();
            arr[k] = i;
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
