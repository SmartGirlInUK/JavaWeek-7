import java.util.Scanner;

public class Q15 {
    /*
    Write a program that tells us input value is number or an alphabet or symbol.
     */
    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any Single Character : ");
        char c = in.next().charAt(0);

        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is a ALPHABET.");
        } else if(c >= '0' && c <= '9') {
            System.out.println(c + " is a DIGIT.");
        } else {
            System.out.println(c + " is a SPECIAL CHARACTER.");
        }
    }
}
