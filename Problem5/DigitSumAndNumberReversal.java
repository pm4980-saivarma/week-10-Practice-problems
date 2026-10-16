import java.math.BigInteger;
import java.util.Scanner;

public class DigitSumAndNumberReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextBigInteger()) {
            return;
        }

        BigInteger number = scanner.nextBigInteger();
        BigInteger remaining = number;
        BigInteger sum = BigInteger.ZERO;
        BigInteger reversed = BigInteger.ZERO;
        BigInteger ten = BigInteger.TEN;

        while (remaining.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] quotientAndDigit = remaining.divideAndRemainder(ten);
            BigInteger digit = quotientAndDigit[1];
            sum = sum.add(digit);
            reversed = reversed.multiply(ten).add(digit);
            remaining = quotientAndDigit[0];
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + reversed);
    }
}
