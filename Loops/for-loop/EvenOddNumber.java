// package Loops.for-loop;
import java.util.*;
public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i%2==0){
                System.out.println("Even Number: " + i);
            }else if(i%3==0){
                System.out.println("Odd Number: " + i);
            }
        }
    }
}
