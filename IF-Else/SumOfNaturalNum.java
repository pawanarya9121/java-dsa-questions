// package IF-Else;
import java.util.*;
public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter num: ");
        int n=sc.nextInt();
        int sum = (n*(n+1))/2;
        System.out.println(sum);
    }
}
