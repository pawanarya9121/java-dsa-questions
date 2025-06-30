import java.util.Scanner;
public class UserInput {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter your name: ");
      String n=sc.nextLine();
      System.out.println("Hello, "+ n);
   }
}
