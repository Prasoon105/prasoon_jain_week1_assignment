package Assignment1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int number = 0;
        
        while (!validInput) {
            System.out.print("Enter an number: ");

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            validInput = true; 
        } else {
            System.out.println("Error: Input is not an number. Please enter a valid number.");
            scanner.next(); 
        }
    }

   
    if (number % 2 == 0) {
        System.out.println(number + " is an even number.");
    } else {
        System.out.println(number + " is an odd number.");
    }

    scanner.close();
}
}

