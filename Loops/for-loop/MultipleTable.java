import java.util.*;
public class MultipleTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter num: ");
        int n=sc.nextInt();
        for(int i=1; i<=10; i++){
            int count = n*i ;
            System.out.println(n+"*"+i+" = " + count);
        }
    }
}
