package DoWhileLoop;

import java.util.Scanner;

    public class Primecode {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int j = 0;//J for count

            for (int i = 1; i <= num; i++) {

                if (num % i == 0) {
                    j++;
                }
            }

            if (j == 2) {
                System.out.println(num + " is a Prime number");
            } else {
                System.out.println(num + " is Not a Prime number");
            }

            sc.close();
        }
    }
