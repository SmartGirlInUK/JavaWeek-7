import java.util.Scanner;

public class Q4 {
    /*
    Take values of length and breadth of a rectangle from user and check if it is square or not.
     */
    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// Create scanner object to read input from the user

        System.out.print("Please Enter Length of Rectangle : ");//Ask user to input number
        int length = in.nextInt();//Read and store value in variable from user
        System.out.print("Please Enter Breadth of Rectangle : ");//Ask user to input number
        int breadth = in.nextInt();//Read and store value in variable from user

        if (length == breadth)
            System.out.println("It's Square.");
        else
            System.out.println("It's not Square.");
    }
}
