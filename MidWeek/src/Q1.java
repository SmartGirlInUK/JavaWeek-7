import java.util.Scanner;

public class Q1 {
    /*
    Take 10 integers from keyboard using loop and print their average value on the screen.
     */
    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        int avg=0;
        for (int i=1; i<=10; i++) {
            System.out.print("Enter Number-"+i+" : ");
            sum = sum + in.nextInt();
            avg = sum/10;
        }
        System.out.println("Average Value is "+ avg);
    }
}
