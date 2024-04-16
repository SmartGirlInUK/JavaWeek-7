import java.util.Scanner;

public class Q8 {
    /*
    Write a java program to get numbers from users and print whether it is positive or negative.
     */
    //Main method
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);//Create scanner object
        System.out.print("Please enter any number : ");//Ask user for input number
        int num=in.nextInt();//Read and store value in variable from user
        //Condition check for positive number
        if (num > 0) {
            System.out.println(num+" is positive number");//Print message
        }
        //Condition check for negative number
        else if (num < 0) {
            System.out.println(num+" is negative number");//Print message
        }
        //else is for if given number is zero.
        else {
            System.out.println("Number is zero");//Print message
        }
    }
}
