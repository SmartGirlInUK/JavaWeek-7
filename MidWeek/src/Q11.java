import java.util.Scanner;

public class Q11 {
    /*
    Write a program to print a string entered by user.
     */
    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// Create scanner object to read input from the user
        System.out.print("Please Enter Any String : ");//Ask user to input number
        String str = in.nextLine();//Read and store value in variable from user

        System.out.println("Your String is : "+str);//Print String
    }
}
