import java.util.Scanner;

public class Q7 {
    /*
    Write a java program to input any number and find out if it’s odd or even.
     */
    //Main method
    public static void main(String[] args) {
        {
            Scanner in=new Scanner(System.in);//Create scanner object
            System.out.print("Please enter any number : ");//Ask user for input number
            int num=in.nextInt();//Read and store value in variable from user
            //Use if condition to check number is even or not
            if (num % 2 == 0){
                System.out.println(num+" is even number.");//Print message
            }
            //Use else condition for odd number
            else {
                System.out.println(num+" is odd number.");//Print message
            }
        }
    }
}
