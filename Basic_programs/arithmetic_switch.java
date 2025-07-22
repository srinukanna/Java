package Basic_programs;

import java.util.Scanner;

public class arithmetic_switch {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println("Sum = " + (a + b));
                break;
            case '-':
                System.out.println("Difference = " + (a - b));
                break;
            case '*':
                System.out.println("Product = " + (a * b));
                break;
            case '/':
                if (b != 0)
                    System.out.println("Quotient = " + (a / b));
                else
                    System.out.println("Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
    }
}
