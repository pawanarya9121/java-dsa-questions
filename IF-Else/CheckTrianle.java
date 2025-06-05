// package IF-Else;
import java.util.*;
public class CheckTrianle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("length: ");
        int l=sc.nextInt();
        System.out.print("breadth: ");
        int b=sc.nextInt();
        System.out.print("height: ");
        int h=sc.nextInt();
        if(l==b && l==h){
            System.out.println("Euilateral");
        }else if(l==b || b==h || h==l){
            System.out.println("Isoscales");
        }else{
            System.out.println("Scalen");
        }
    }
}
