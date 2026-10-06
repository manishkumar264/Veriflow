package DoWhileLoop;

import java.util.Scanner;

public class ATMMenu {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // ATM Menu
            int balance = 10000;
            int choice;

            do {
                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                if (choice == 1) {

                    System.out.println("Balance = " + balance);

                } else if (choice == 2) {

                    System.out.print("Enter deposit amount: ");
                    int deposit = sc.nextInt();

                    balance = balance + deposit;

                    System.out.println("Deposit successful!");
                    System.out.println("Balance = " + balance);

                } else if (choice == 3) {

                    System.out.print("Enter withdrawal amount: ");
                    int withdraw = sc.nextInt();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;

                        System.out.println("Withdrawal successful!");
                        System.out.println("Balance = " + balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }

                } else if (choice == 4) {

                    System.out.println("Thank you for using ATM!");

                } else {

                    System.out.println("Invalid choice!");

                }

            } while (choice != 4);

            sc.close();
        }
    }
