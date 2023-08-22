import java.util.Scanner;

public class arrivalofgeneral{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int mini=0;
        int maxi= 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
                maxi = i;
            }
            if(arr[i]<=min){
                min = arr[i];
                mini=i;
            }
        }
        if(maxi>mini){
            System.out.println((maxi-1)+(arr.length-1 - mini)-1);
        } 
        else{
              System.out.println((maxi)+(arr.length-1 - mini));
        }
    }
}
