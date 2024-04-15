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

        String msg = (num % 2 == 0) ? " number is even." : " number is odd";//Find number is odd or even
        System.out.println(num+msg);//print message

    }
}
