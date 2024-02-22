import java.util.Arrays;
import java.util.Scanner;

public class sashaandbeautifularray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ;i<arr.length;i++){
            arr[i] = sc.nextInt(); 
        }
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        int res = max-min;
        System.out.println(res);
    }
    }
}
