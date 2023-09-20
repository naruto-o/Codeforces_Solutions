import java.util.Scanner;

public class gennadyandacard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s4 = sc.next();
        String s5 = sc.next();
        boolean flag = true;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==s1.charAt(i) || str.charAt(i)==s2.charAt(i) || str.charAt(i)==s3.charAt(i) ||str.charAt(i)==s4.charAt(i) ||str.charAt(i)==s5.charAt(i)){
                System.out.println("YES"); 
                flag = false;
                break;  
            }
        }
        if(flag == true){
            System.out.println("NO");
        }
    }
}
