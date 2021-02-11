import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        String reverse = "";
        System.out.printf("Enter original string here : ");
        Scanner scanner = new Scanner(System.in);
        String original = scanner.next();
        for(int i=original.length()-1;i>=0;i--)
        {
            reverse +=original.charAt(i);
        }
        if(reverse.equals(original)){
            System.out.printf("Palindrome");
        }
        else {
            System.out.printf("Not Palindrome");
        }
    }
}