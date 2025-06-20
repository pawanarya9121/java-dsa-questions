import java.util.*;
public class PrintAllPrimeNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter num: ");
        int n=sc.nextInt();
        boolean Prime = true ;
        if(n<=1){
            Prime = false ;
        }else{
            for(int i=2; i<=n/2; i++){
                if(n%i==0){
                    Prime = false ;
                }
            }
        }
        if(Prime){
            System.out.println(n+ " is prime");
        }else{
            System.out.println(n + "not prime");
        }
    }
}