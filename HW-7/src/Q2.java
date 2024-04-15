import java.util.Arrays;

public class Q2 {
    /*
    Declare array and store any 5 countries and print them in console.
     */
    //Main method
    public static void main(String[] args) {
        String[] countries = {"India", "England", "Canada", "USA", "Mexico" };
        System.out.println("First way = "+Arrays.toString(countries));//Print countries name
        System.out.println("\nSecond way =");

        int i = 0;
        //Use while loop for condition to print array line by line.
        while (i < countries.length) {
            System.out.println("Array["+i+"] : " + countries[i]);
            i++;
        }
    }
}
