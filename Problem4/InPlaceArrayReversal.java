import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InPlaceArrayReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        while (scanner.hasNextLine()) {
            input.append(scanner.nextLine()).append(' ');
        }

        Matcher matcher = Pattern.compile("-?\\d+").matcher(input);
        List<Integer> numbers = new ArrayList<>();
        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }

        for (int left = 0, right = numbers.size() - 1; left < right; left++, right--) {
            int temporary = numbers.get(left);
            numbers.set(left, numbers.get(right));
            numbers.set(right, temporary);
        }

        System.out.println(numbers);
    }
}
