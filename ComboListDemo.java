import javax.swing.*;  // Import necessary Swing components

public class ComboListDemo {
    public static void main(String[] args) {

        // Create the main application window
        JFrame f = new JFrame("ComboBox and List");

        // Create an array of programming languages
        String[] langs = {"Java", "Python", "C++"};

        // Create a combo box (drop-down) with the language array
        JComboBox<String> combo = new JComboBox<>(langs); // Only one can be selected

        // Create a list from the same array (multiple visible items)
        JList<String> list = new JList<>(langs); // Displays list of all options

        // Create a panel to arrange UI components
        JPanel panel = new JPanel();

        // Add a label and combo box to the panel
        panel.add(new JLabel("Select Language:"));
        panel.add(combo);

        // Add a label and list to the panel
        panel.add(new JLabel("Choose from List:"));
        panel.add(list);

        // Add the panel to the main frame
        f.add(panel);

        // Set the window size
        f.setSize(300, 200);

        // Make the window visible
        f.setVisible(true);

        // Exit application when the window is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
