import java.util.*;
public class petrandbook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        while(true){
            for (int i = 0; i < arr.length; i++) {
                n = n - arr[i];
                if(n<=0){
                    System.out.println(i+1);
                    break;
                }
            }
            if(n<=0){
                break;
            }
        }
    }
}
