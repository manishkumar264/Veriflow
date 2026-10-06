package DoWhileLoop;

public class SubPrint {
        public static void main(String[] args) {
            int a = 20;
            int b = 8;
            int result;
            do {
                result = a - b;
                System.out.println("Subtraction = " + result);
                a = 0;   // to stop the loop
            } while (a != 0);
        }
    }