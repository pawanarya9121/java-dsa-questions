// package IF-Else;
import java.util.*;
public class FindEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter num: ");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
