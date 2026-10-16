import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < 0) {
                throw new IllegalArgumentException("Factorial is not defined for negative integers.");
            }

            BigInteger factorial = BigInteger.ONE;
            for (int factor = 2; factor <= number; factor++) {
                factorial = factorial.multiply(BigInteger.valueOf(factor));
            }
            System.out.println(factorial);
        }
    }
}
