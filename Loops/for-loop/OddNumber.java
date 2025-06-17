import java.util.*;
public class OddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter num: ");
        int n=sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
