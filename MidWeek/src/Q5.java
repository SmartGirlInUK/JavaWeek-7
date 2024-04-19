import java.util.Scanner;

public class Q5 {
    /*
    Take two int values from user and print greatest among them.
     */
    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// Create scanner object to read input from the user
        System.out.print("Please Enter First Number: ");//Ask user to input number
        int num1 = in.nextInt();//Read and store value in variable from user
        System.out.print("Please Enter Second Number: ");//Ask user to input number
        int num2 = in.nextInt();//Read and store value in variable from user

        if (num1==num2)
            System.out.println("Both Numbers are Equal.");
        else
            System.out.println(Math.max(num1,num2)+" is greatest than "+Math.min(num1,num2));

    }
}
