public class Q14 {
    /*
    Write a java program to print the numbers between 1 and 100 which can be divided by 3 and 5 separately.
     */
    //Main method
    public static void main(String[] args) {
        // Print numbers divided by 3
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        // Print numbers divided by 5
        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ", ");
        }
    }
}
