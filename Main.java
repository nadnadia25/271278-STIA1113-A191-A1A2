package com.nurul;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);

        double carPrice;
        double downPayment;
        int loanPeriod;
        int interestRate;
        double interest, principal, remainingBalance, remainingLoan;
        int month = 1;
        double monthlyPayment = 0;
        double sumLoanPayment;
        double sumPrincipal =0;
        double sumInterest =0;

        System.out.println("enter car price (rm) :?");
        carPrice = input.nextInt();
         if (carPrice > 30000) {
             System.out.println("car price cannot less than rm30000");
         }
         else if (carPrice > 30000) {
             System.out.println("the loan cannot less than rm30000");
             return;
         }

        System.out.println("\nenter down payment (rm) : ");
         downPayment = input.nextInt();
         if (downPayment >= carPrice) {
             System.out.println("the loan was paid in full");
             return;
         }

        System.out.println("\nenter loan period :");
         loanPeriod = input.nextInt();
         if (loanPeriod <= 0) {
             System.out.println("a mistake! you must take a valid loan");
             return;
         }
         else if (loanPeriod <= 5 || loanPeriod >= 9) {
             System.out.println("the loan cannot be longer than 5 years");
             return;
         }

        System.out.println("\nenter interest rate (%)");
         interestRate = input.nextInt();
         if (interestRate  <= 3 || interestRate >= 7) {
            System.out.println("interest rate cannot less than 3% and cannot less than 7%");
            return;
        }

         remainingLoan = carPrice - downPayment;

         interest = remainingLoan * interestRate /100;

        principal = remainingLoan / loanPeriod + interest;

        monthlyPayment = principal / 12;
        System.out.print("your monthly repayment is: rm");
        System.out.printf("%.2f\n\n", monthlyPayment);

        sumLoanPayment = remainingLoan + (interest * loanPeriod);

        System.out.printf("%-5s%25s%25s%25s\n", "Years", "Principal(RM)", "Interest(RM)", "Balance(RM)");
        do {
            sumPrincipal = sumPrincipal + principal;
            sumInterest = sumInterest + interest;
            remainingBalance = sumLoanPayment - sumPrincipal;
            System.out.printf("%-5s%25.2f%25.2f%25.2f\n", month, sumPrincipal, sumInterest, remainingBalance);
            month++;
        } while (month <= loanPeriod);

    }
}
