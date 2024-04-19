import java.util.Scanner;

public class Q2 {
    /*
    Print multiplication table of 24, 50 and 29 using loop.
     */
    //Main method
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);// Create scanner object to read input from the user

        System.out.print("Please Enter a Number: ");//Ask user to input number

        int num = in.nextInt();//Read and store value in variable from user

        //For loop to calculate multiplication table for the given number from user
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i ));//Calculate and print each line
        }
    }
}
