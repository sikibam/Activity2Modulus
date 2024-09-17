import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Title of the program
        System.out.println("This program converts input time in Seconds to its equivalent in Hours, Minutes, and Seconds");

        // Get input from user
        System.out.print("Input time in seconds: ");
        int totalSeconds = Integer.parseInt(reader.readLine());

        // Convert to hours, minutes, and seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // Display the result as a table
        System.out.println("\n----------------------------------");
        System.out.printf("| %-15s | %-15s |\n", "Unit", "Value");
        System.out.println("----------------------------------");
        System.out.printf("| %-15s | %-15d |\n", "Hours", hours);
        System.out.printf("| %-15s | %-15d |\n", "Minutes", minutes);
        System.out.printf("| %-15s | %-15d |\n", "Seconds", seconds);
        System.out.println("----------------------------------");
    }
}
