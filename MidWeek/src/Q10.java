import java.util.Scanner;

public class Q10 {
    /*
    Write a program to print the sum of two numbers entered by user by defining your own method.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// Create scanner object to read input from the user
        System.out.print("Please Enter First Number: ");//Ask user to input number
        int num1 = in.nextInt();//Read and store value in variable from user
        System.out.print("Please Enter Second Number: ");//Ask user to input number
        int num2 = in.nextInt();//Read and store value in variable from user
        Q10 q10 = new Q10();// create class object
        q10.sum(num1,num2);//call instance method using object

    }

    public void sum(int num1, int num2) {
        System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
    }
}
