import java.util.Scanner;

public class Q11 {
    /*
    Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any
    other alphabet should be invalid entry.
     */
    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any alphabet between A to F : ");
        char a = in.next().charAt(0);
        if ((a >= 'a' && a <= 'f') || (a >= 'A' && a <= 'F')) {
            System.out.println("City Name Starts with "+a+" :");
            if (a == 'a' || a == 'A') {
                System.out.println("AGRA\nAJMER\nAHMEDABAD\nANAND\nAMBALA");
            } else if (a == 'b' || a == 'B'){
                System.out.println("BADRINATH\nBANGALORE\nBHARUCH\nBHAVNAGAR\nBHUJ");
            }else if (a == 'c' || a == 'C'){
                System.out.println("CHENNAI\nCHANDIGARH\nCHITTORGARH\nCOONOOR\nCHAMBAx");
            }else if (a == 'd' || a == 'D'){
                System.out.println("DIU\nDAMAN\nDWARKA\nDURGAPUR\nDEHRADUN");
            }else if (a == 'e' || a == 'E'){
                System.out.println("EDINBURGH\nELY\nENFIELD\nEASTBOURNE\nEGHAM");
            }else {
                System.out.println("FIROZABAD\nFARIDABAD");
            }
        }
        else{
        System.out.println("Invalid Input.");
        }
    }
}
