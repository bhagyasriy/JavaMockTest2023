import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter a list of numbers (enter -1 to finish):");

        int input;
        do {
        input = scanner.nextInt();
            if (input != -1) {
                numbers.add(input);
            }
        } while (input != -1);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.size();
        System.out.println("Average: " + average);

        scanner.close();
    }
}
