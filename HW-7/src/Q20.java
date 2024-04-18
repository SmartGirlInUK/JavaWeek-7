import java.util.Arrays;

public class Q20 {
    /*
    Write a Java program to sort a numeric array and a string array.
     */
    //Main method
    public static void main(String[] args) {
        int[] num={98,3,65,25,8,4,30,9,1,0};
        String[] str={"Minal","Padsala","India","Apple","Uk","Gujarat"};

        System.out.println("Numeric Array : "+Arrays.toString(num)+"\nString Array : "+Arrays.toString(str)+"\n");
        Arrays.sort(num);//Sort array
        Arrays.sort(str);//Sort array
        System.out.println("Sorted Numeric Array : "+Arrays.toString(num)+"\nSorted String Array : "+Arrays.toString(str));//Print sorted array

    }
}
