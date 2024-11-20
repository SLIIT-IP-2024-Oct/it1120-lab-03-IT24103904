import java.util.Scanner;

public class IT24103904Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid five-digit number.");
            return;
        }

        String numberString = Integer.toString(number);

        for (char digit : numberString.toCharArray()) {
            System.out.print(digit + " ");
        }

        scanner.close();
    }
}