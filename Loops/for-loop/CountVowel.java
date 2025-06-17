import java.util.*;
public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter sentence: ");
        String str = sc.nextLine();
        int VowelCount = 0 ;
        for (int i = 0; i <= str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
                VowelCount++ ;
            }
            System.out.println(VowelCount);
        }
        
    }
}
