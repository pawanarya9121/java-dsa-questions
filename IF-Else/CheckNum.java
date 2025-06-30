// package IF-Else;
import java.util.*;
public class CheckNum {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter num: ");
      int n=sc.nextInt();
      if(n>0){
         System.out.println("Positive");
      }else if(n==0){
         System.out.println("Zero");
      }else{
         System.out.println("Negative");
      }
   }
}
