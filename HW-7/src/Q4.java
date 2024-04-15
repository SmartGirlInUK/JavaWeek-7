import java.util.Scanner;

public class Q4 {
    /*
    Write if else condition and print your group name in console else others group name.
     */
    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//Create scanner object
        System.out.print("Please enter your group number : ");//Ask user for input number
        int grpNo=in.nextInt();//Read and store value in variable from user

        if (grpNo == 3) {
            System.out.println("Your Group Member Name :\nNirali\nMinal\nShubham\nDarshan\nDhaval");
        } else {
            System.out.println("Other Group Member Name :\nMaharshi\nMaulik\nDeep\nJanki");
        }
    }
}
