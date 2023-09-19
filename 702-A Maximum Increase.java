import java.util.Scanner;

public class maximumincrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int temp =1;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                temp++;
            }else{
                if(temp>max){
                    max = temp;
                }
                temp=1;
            }
        }
        if(temp>max){
            max = temp;
        }
        System.out.println(max);
    }
}
