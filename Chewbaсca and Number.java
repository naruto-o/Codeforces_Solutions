import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = 0 ; i<s.length();i++){
            char c = s.charAt(i);
            if(i == 0 && s.charAt(i)>='5' && s.charAt(i)<'9'){
                // s.charAt(i) = '9'-s.charAt(i) +'0';
                s = s.substring(0, i) + ('9'-s.charAt(i)) + s.substring(i + 1);
            }
            else if( i > 0 && s.charAt(i)>='5'){
                  s = s.substring(0, i) + ('9'-s.charAt(i)) + s.substring(i + 1);
            }
        }
        System.out.println(s);
    }
}
