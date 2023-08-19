import java.util.Scanner;

public class foxandsnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char arr[][]=new char[n][m];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                arr[i][j] = '.';
            }
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(i%2 == 0){
                    arr[i][j] = '#';
                }
                }
            }
        boolean flag = true;
        for(int i = 1;i<arr.length;i+=2){
                    if(flag == true){
                        arr[i][arr[0].length-1] = '#';
                        flag = false;
                    }
                    else{
                        arr[i][0] = '#';
                        flag = true;
                    }
        }
              for(int ii = 0;ii<arr.length;ii++){
                for(int jj = 0;jj<arr[ii].length;jj++){
                    System.out.print(arr[ii][jj]);
            }
            System.out.println();
        }
        }   
    }

