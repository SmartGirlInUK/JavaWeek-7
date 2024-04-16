import java.util.Scanner;

public class Q25 {
    /*
    Declare one method with return type and parameter and print your name in console.
     */
    //Main method
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Your First Name : ");
        String fn=in.next();
        System.out.print("Enter Your Last Name : ");
        String ln=in.next();
        Q25 q25=new Q25();
        q25.name(fn,ln);
    }
    public void name(String fn,String ln){
        System.out.println("Your Full Name is "+fn+" "+ln);
    }
}
