import java.util.Scanner;
public class antonandpolyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a=0;
        for(int i = 0;i<=n;i++){
            String s = sc.nextLine().intern();
            if(s=="Tetrahedron"){
              a+= 4 ;
            }
            else if(s=="Cube"){
                a+=6;
            }
            else if(s=="Octahedron"){
                a+=8;
            }
            else if(s=="Dodecahedron"){
                a+=12;
            }
            else if(s=="Icosahedron"){
                a+=20;
            }
        }
        System.out.println(a);
    }
}
