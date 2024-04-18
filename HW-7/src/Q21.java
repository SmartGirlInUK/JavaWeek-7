public class Q21 {
    /*
    Write a Java program to sum values of an array.
     */
    //Main method
    public static void main(String[] args) {
        int[] a={1,2,4,6,5,2};
        int sum=0;

        for (int i : a) {
            sum += i;
        }
        System.out.println("Sum of Array : "+sum);
    }
}