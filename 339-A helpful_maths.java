https://codeforces.com/problemset/problem/339/A
import java.utl.Scanner;
import java.util.Arrays;
public class helpful_maths{
  public static void man(String [] args){
    Scanner sc = new Scanner(Syste,.in);
    string s  =  sc.next();
    s = s.replace    ("+", "" );
     char arr[] = s.toCharArray();
     Arrays.sort(arr);
    for (int i = 0; i < s.length(); i++) {
                if(i ==0){
                    System.out.print(arr[i]);
                }
                else{
                    System.out.print("+"+arr[i]);
                }
            }
    }
}
