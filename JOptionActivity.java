import javax.swing.JOptionPane;

public class JOptionActivity {
    public static void main(String[] args) {
        // Get input from the user via JOptionPane
        String input = JOptionPane.showInputDialog(null, "This program converts input time in Seconds to its equivalent in Hours, Minutes, and Seconds\n\nInput time in seconds:");

        // Convert the input to an integer
        int totalSeconds = Integer.parseInt(input);

        // Convert to hours, minutes, and seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
      
        StringBuilder result = new StringBuilder();
        result.append("----------------------------------\n");
        result.append(String.format("| %-15s | %-15s |\n", "Unit", "Value"));
        result.append("----------------------------------\n");
        result.append(String.format("| %-15s | %-15d |\n", "Hours", hours));
        result.append(String.format("| %-15s | %-15d |\n", "Minutes", minutes));
        result.append(String.format("| %-15s | %-15d |\n", "Seconds", seconds));
        result.append("----------------------------------");

        // Display the result in a message dialog box
        JOptionPane.showMessageDialog(null, result.toString(), "Time Conversion Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
