import java.util.Arrays;
import java.util.Scanner;

public class Assigningtoclasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int  n = sc.nextInt();
            int arr[] = new int[2*n];
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int x1 = arr[n];
            int x2 = arr[n-1];
            int x3 = Math.abs(x1-x2);
            System.out.println(x3);
        }
    }
}
