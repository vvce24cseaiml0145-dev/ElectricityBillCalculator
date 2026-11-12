
package com.example;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ElectricityBillCalculator {

    public static double calculateBill(int units) {

        if (units < 0) {
            throw new IllegalArgumentException(
                "Units cannot be negative"
            );
        }

        double bill = 0;

        if (units <= 100) {
            bill = units * 1.50;
        }
        else if (units <= 200) {
            bill = (100 * 1.50)
                 + ((units - 100) * 2.50);
        }
        else if (units <= 300) {
            bill = (100 * 1.50)
                 + (100 * 2.50)
                 + ((units - 200) * 4.00);
        }
        else {
            bill = (100 * 1.50)
                 + (100 * 2.50)
                 + (100 * 4.00)
                 + ((units - 300) * 6.00);
        }

        return bill;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter electricity units consumed: ");

        try {

            int units = scanner.nextInt();

            double bill = calculateBill(units);

            System.out.println("Units Consumed: " + units);

            System.out.println("Electricity Bill: Rs. " + bill);

        }
        catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }
        catch (InputMismatchException e) {

            System.out.println(
                "Error: Please enter a valid integer."
            );

        }
        finally {

            scanner.close();

        }
    }
}

