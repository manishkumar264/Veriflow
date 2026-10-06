package DoWhileLoop;

public class ModPrint {
        public static void main(String[] args) {
            int a = 20;
            int b = 3;
            int result;
            do {
                result = a % b;
                System.out.println("Result = " + result);
                a = 0;   // to stop the loop
            } while (a != 0);
        }
    }