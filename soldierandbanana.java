import java.util.Scanner;

public class soldierandbanana {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int k = sc.nextInt();
           //cost of first banana
           int n = sc.nextInt();
           //total dollats
           int w = sc.nextInt();
           //no of banana he wants
           int dlrs = 0;
           for(int i = 1;i<=w;i++){
                dlrs += (i*k);
           }
           if(dlrs <= n){
            System.out.println(0);
           }
           else{
            System.out.println(dlrs-n);
           }
       }
    }

