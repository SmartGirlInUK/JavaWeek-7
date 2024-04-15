import java.util.Scanner;

public class Q1 {
    /*
    Write a java program that tells us that Input number is odd or even?
    HINT: use ternary operator(? :)
     */
    //MAIN METHOD
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);//Create scanner object
        System.out.print("Please enter any number : ");//Ask user for input number
        int num=in.nextInt();//Read and store value in variable from user
        //Use if condition to check number is even or not
        if (num % 2 == 0){
            System.out.println(num+" is even number.");//Print
        }
        //Use else condition for odd number
        else {
            System.out.println(num+" is odd number.");//Print
        }

    }
}
