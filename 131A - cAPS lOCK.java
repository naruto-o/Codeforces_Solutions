import java.util.Scanner;

public class capslock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        boolean flag = false;
        boolean flag2 = false;
        if(s.charAt(0)>='A' && s.charAt(0)<='Z'){
            for(int i = 1;i<s.length();i++){
                if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                    continue;
                }
                else{
                    System.out.println(s);
                    flag = true;
                    return;
                }
            }
            flag2 = true;
        }
        if(s.charAt(0)>='a' && s.charAt(0)<='z'){
            for(int i = 1;i<s.length();i++){
                if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                    continue;
                }
                else{
                    System.out.println(s);
                    flag = true;
                    return;
                }
            }
        } 
        if(flag2 == true){
            s = s.toLowerCase();
            System.out.println(s);
            return;
        }
        if(flag == false){
            str += s.charAt(0);
            str = str.toUpperCase();
            s = s.toLowerCase();
            for(int i = 1;i<s.length();i++){
                str += s.charAt(i);
            }
            System.out.println(str);
        }
}
    }

