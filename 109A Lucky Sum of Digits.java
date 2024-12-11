import java.util.Scanner;
public class luckynumbersum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder str = new StringBuilder();
        while(n>0 && n%7!=0){
            n = n -4;
            str.append(4);
        }
        while (n>0 && n%7==0){
            n = n -7 ;
            str.append(7);
        }
        if(n==0){
            System.out.println(str);
            return;
        }
        else{
            System.out.println(-1);
            return;
        }
    }
}
