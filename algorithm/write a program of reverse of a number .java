import java.util.Scanner;

public class ReverseNumber {

    // Function to reverse a given integer
    public static int reverseNumber(int num) {
        int reversed = 0;

        // Loop until all digits are processed
        while (num != 0) {
            // Extract the last digit
            int digit = num % 10;

            // Append the digit to the reversed number
            reversed = reversed * 10 + digit;

            // Remove the last digit from the original number
            num /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();

        // Call the reverseNumber function
        int reversed = reverseNumber(num);

        // Print the reversed number
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}
