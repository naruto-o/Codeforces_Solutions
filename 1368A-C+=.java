import java.util.Scanner;

public class cplusequal{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t  = sc.nextInt();
          while(t-->0){
        int a = sc.nextInt();
        int b= sc.nextInt();
        int n= sc.nextInt();
      
             int sum = 0;
        int c =0;
        while(sum<=n){
            if(a>b){
                b+=a;
                sum = b;
                c++;
            }
            else{
                a+=b;
                sum =a;
                c++;
            }
            if(sum>n){
                break;
            }
        }
        System.out.println(c);
    }
    }
}
