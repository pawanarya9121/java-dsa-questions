// package IF-Else;
import java.util.*;
public class UpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter char: ");
        char ch=sc.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("Upper Case");
        }else{
            System.out.println("Lower Case");
        }
    }
}
