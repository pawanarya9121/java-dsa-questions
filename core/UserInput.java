import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String str=sc.nextLine();
        System.out.println("Hello, "+ str);
    }
}
