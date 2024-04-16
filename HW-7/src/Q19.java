import java.util.Scanner;

public class Q19 {
    /*
    Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
     */
    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//Create scanner object
        System.out.print("Please enter any number : ");//Ask user for input number
        int num = in.nextInt();//Read and store value in variable from user
        //Condition check for positive number
        if (num > 0) {
            System.out.println(num + " is Positive Number");//Print message
        }
        //Condition check for negative number
        else if (num < 0) {
            System.out.println(num + " is Negative Number");//Print message
        }
        //else is for if given number is zero.
        else {
            System.out.println("Number is Zero");//Print message
        }
    }
}
