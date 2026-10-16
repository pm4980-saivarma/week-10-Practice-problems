import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            boolean isPrime = number > 1;

            for (long divisor = 2; isPrime && divisor <= number / divisor; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                }
            }

            System.out.println(number + (isPrime ? " is prime" : " is not prime"));
        }
    }
}
