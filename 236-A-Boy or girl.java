
import java.util.Arrays;
import java.util.Scanner;

public class boyorgirl {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        char[]ch = s.toCharArray();
        Arrays.sort(ch);
        int count =1;
        for (int i = 1; i < ch.length; i++) {
            if(ch[i]!=ch[i-1]){
                count++;
            }
        }
        if(count%2==0){
            System.out.println("CHAT WITH HER");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
