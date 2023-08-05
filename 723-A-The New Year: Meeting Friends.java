import java.util.Arrays;
import java.util.Scanner;

public class newyearmeeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();   
        }
        Arrays.sort(arr);
        int a = arr[2] - arr[1];
        int b = arr[1] - arr[0];
        int c = a+b;
        System.out.println(c);
    }
}
