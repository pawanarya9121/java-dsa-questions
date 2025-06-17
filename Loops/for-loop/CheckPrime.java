import java.util.*;
public class CheckPrime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter num: ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            if(n%n==0 && n%i==0){
                System.out.println("not prime");
            }else{
                System.out.println("prime");
            }
        }
    }
}