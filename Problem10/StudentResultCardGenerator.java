import java.util.Locale;
import java.util.Scanner;

public class StudentResultCardGenerator {
    private static char gradeFor(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else if (average >= 40) {
            return 'D';
        }
        return 'F';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                continue;
            }

            String[] parts = line.split("\\s+");
            if (parts.length != 4) {
                throw new IllegalArgumentException("Each line must contain a name and three marks.");
            }

            double total = 0;
            for (int index = 1; index < parts.length; index++) {
                total += Integer.parseInt(parts[index].replaceAll("[^0-9-]", ""));
            }
            double average = total / 3.0;

            System.out.printf(
                Locale.ROOT,
                "%s: Average %.1f, Grade %c%n",
                parts[0].toUpperCase(Locale.ROOT),
                average,
                gradeFor(average)
            );
        }
    }
}
