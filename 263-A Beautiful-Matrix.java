import java.util.Scanner;
//striver cp sheet 3 answer
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];
        for(int i = 0; i< arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int a = 0;
        for(int i = 0; i< arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] == 1){
                       a =  Math.abs(((i+1)-3))+Math.abs((j+1)-3);
                    break;
                }
            }
        }
        System.out.println(Math.abs(a));
    }
}
