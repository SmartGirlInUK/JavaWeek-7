import java.util.Scanner;

public class Q7 {
    /*
    Take input of age of 3 people by user and determine oldest and youngest among them.
     */
    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// Create scanner object to read input from the user
        System.out.print("Please Enter First Person Age : ");//Ask user to input number
        int age1 = in.nextInt();//Read and store value in variable from user
        System.out.print("Please Enter Second Person Age : ");//Ask user to input number
        int age2 = in.nextInt();//Read and store value in variable from user
        System.out.print("Please Enter Third Person Age : ");//Ask user to input number
        int age3 = in.nextInt();//Read and store value in variable from user

        if (age1 == age2 && age1 == age3)
            System.out.println("3 of them are same age people.");
        else if (age1 > age2 && age1 > age3)
            System.out.println("First Person is Oldest");
        else if (age2 > age1 && age2 > age3) {
            System.out.println("Second Person is Oldest");
        } else
            System.out.println("Third Person is Oldest");

        if (age1 < age2 && age1 < age3)
            System.out.println("First Person is Younger");
        else if (age2 < age1 && age2 < age3) {
            System.out.println("Second Person is Younger");
        } else
            System.out.println("Third Person is Younger");

    }
}
