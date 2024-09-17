import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TimeConversionTableFormat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Title
        System.out.println("This program converts input time in Seconds to its equivalent in Hours, Minutes, and Seconds");

        // Get input from user
        System.out.print("Input time in seconds: ");
        int totalSeconds = Integer.parseInt(reader.readLine());

        // Convert to hours, minutes, and seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // Display result in formatted output
        System.out.println("The inputted time equivalent to:");
        System.out.printf("%-10s: %5d Hours\n", "Hours", hours);
        System.out.printf("%-10s: %5d Minutes\n", "Minutes", minutes);
        System.out.printf("%-10s: %
