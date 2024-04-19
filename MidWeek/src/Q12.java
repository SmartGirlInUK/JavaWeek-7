import java.util.Scanner;

public class Q12 {
    /*
    Write a program to find the length of the string "refrigerator".
     */
    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// Create scanner object to read input from the user
        System.out.print("Please Enter Any String : ");//Ask user to input number
        String str = in.nextLine();//Read and store value in variable from user

        System.out.println(str.length());//Print length of the string.
    }
}
