// package Loops.for-loop;
import java.util.*;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter sentence: ");
        String sent = sc.nextLine();
        sent = sent.toLowerCase();
        int VowelCount = 0;
        for(int i=0; i<=sent.length(); i++){
            char ch=sc.next().charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                VowelCount++ ;
            }
        }
        System.out.println("No of Vowels: " + VowelCount);
    }
}
