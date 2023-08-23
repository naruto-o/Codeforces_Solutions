import java.util.Scanner;

public class insearchofeasyproblem {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                System.out.println("HARD");
                flag = false;
               break;
            }
        }
        if(flag == true){
                System.out.println("EASY");
        }
    }
}
