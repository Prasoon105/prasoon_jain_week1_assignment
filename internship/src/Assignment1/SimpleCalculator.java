package Assignment1;

import java.util.Scanner;

public class SimpleCalculator {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueOperation;

        do {
        	
        System.out.print(" Welcome to Simple Calculater \n ");
       
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

       
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

       
        System.out.print("Choose an operation \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n");
        int operation = scanner.nextInt();

        double result = 0;

        
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;
            case 4:
                try {
                   
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                } catch (ArithmeticException e) {
                   
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose 1,2,3,4.");
                break;
        }
        
        

        
        System.out.print("Do you want to perform another operation? (y/n): ");
        continueOperation = scanner.next().charAt(0);

    	} 
	    while (continueOperation == 'y' || continueOperation == 'Y'); 

        System.out.println("Thank you for using the calculator. Goodbye!");
        
        scanner.close();
    }
}
