package DoWhileLoop;

import java.util.Scanner;

public class ATMlogin {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int correctPin = 1234;
            int pin;
            int attempts = 0;
            boolean login = false;

            // PIN verification
            do {
                System.out.print("Enter your PIN: ");
                pin = sc.nextInt();

                if (pin == correctPin) {
                    System.out.println("Login successful!");
                    login = true;
                    break;
                } else {
                    attempts++;
                    System.out.println("Wrong PIN!");
                    System.out.println("Attempts left: " + (3 - attempts));
                }

            } while (attempts < 3);

            // ATM blocked
            if (!login) {
                System.out.println("ATM is blocked!");
                return;
            }
            sc.close();
        }
    }
