import java.util.Scanner;

public class Q26 {
    /*
    Write a Java program to reverse a word.
     */
    //Main method
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);//Create scanner object
        System.out.print("Please enter any word : ");//Ask user for input number
        String word=in.next();//Read and store value in variable from user
        StringBuilder strBuildr=new StringBuilder(word);//Create object for StringBuilder function and pass variable in parameter.
        strBuildr.reverse();//Reverse word using reverse function.
        System.out.println(strBuildr);//Print reverse word.
    }
}
