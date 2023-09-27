import java.util.*;
public class vanyaandcubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1,i=1,cnt =0;
        while(sum<=n){
            sum  = (i*i+i)/2;
            if(sum>n){
                break;
            }
            n = n - sum;
            i++;
            cnt++;
        }
        System.out.println(cnt);
    }
}
