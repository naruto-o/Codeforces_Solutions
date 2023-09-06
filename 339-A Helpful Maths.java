import java.util.Arrays;
import java.util.Scanner;

public class helpfulmaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        String res = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!='+'){
                res += s.charAt(i);
            }
        }
        char ch[] = res.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i < ch.length-1; i++) {
            if(ch.length>1){
            System.out.print(ch[i]+"+");
            }
        }
        System.out.println(ch[ch.length-1]);
    }
}

