import java.util.Scanner;

public class Q12 {
    /*
    Input any alphabet from “A" to “F” and print their city name accordingly (use switch statement) if any
    other alphabet should be invalid entry.
     */
    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any alphabet between A to F : ");
        char a = in.next().charAt(0);
        if ((a >= 'a' && a <= 'f') || (a >= 'A' && a <= 'F')) {
            System.out.println("City Name Starts with "+a+" :");
            switch (a){
                case 'a':
                    System.out.println("AGRA\nAJMER\nAHMEDABAD\nANAND\nAMBALA");
                    break;
                case 'b':
                    System.out.println("BADRINATH\nBANGALORE\nBHARUCH\nBHAVNAGAR\nBHUJ");
                    break;
                case 'c':
                    System.out.println("CHENNAI\nCHANDIGARH\nCHITTORGARH\nCOONOOR\nCHAMBAx");
                    break;
                case 'd':
                    System.out.println("DIU\nDAMAN\nDWARKA\nDURGAPUR\nDEHRADUN");
                    break;
                case 'e':
                    System.out.println("EDINBURGH\nELY\nENFIELD\nEASTBOURNE\nEGHAM");
                    break;
                case 'f':
                    System.out.println("FIROZABAD\nFARIDABAD");
                    break;
                default:break;
            }
        }else {
            System.out.println("Invalid Input.");
        }
    }
}
