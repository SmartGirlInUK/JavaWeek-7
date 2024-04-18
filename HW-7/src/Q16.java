import java.util.Scanner;

public class Q16 {
    /*
    Write a Java program which input any number between 1 and 7 and it print The Days name
    MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch. NOTE: if
    number is out of selection Print message “Week contains 1 to 7 days”
     */
    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number between 1 and 7 : ");
        int num=in.nextInt();
        String dayName = switch (num) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid number.\nWeek contains only 1 to 7 days";
        };
        System.out.println(dayName);

    }
}
