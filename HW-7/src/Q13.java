import java.util.Scanner;

public class Q13 {
    /*
    Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
    find addition, Subtraction, multiplication and division according to their symbol(using if else)
     */
    //Main method
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1=in.nextInt();
        System.out.print("Enter Second Number : ");
        int num2=in.nextInt();
        System.out.print("Choose symbol according to operation you want to perform(+, -, /, *) : ");
        String symbol=in.next();

        if (symbol.equals("+")){
            int add=num1+num2;
            System.out.println(num1+" + "+num2+" = "+add);
        } else if (symbol.equals("-")) {
            int sub=num1-num2;
            System.out.println(num1+" - "+num2+" = "+sub);
        } else if (symbol.equals("*")) {
            int mul=num1*num2;
            System.out.println(num1+" x "+num2+" = "+mul);
        } else if (symbol.equals("/")) {
            int div=num1/num2;
            System.out.println(num1+" / "+num2+" = "+div);
        } else
            System.out.println("Invalid Input.\nYou can only choose this symbols : +, -, /, *.");
        }
    }