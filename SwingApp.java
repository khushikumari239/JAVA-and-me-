import javax.swing.*;  // Import Swing components like JFrame, JLabel, JButton

public class SwingApp {
    public static void main(String[] args) {

        // Create a new window (frame) with the title "Swing Demo"
        JFrame frame = new JFrame("Swing Demo");

        // Create a label with the text "Welcome!" and center alignment
        JLabel label = new JLabel("Welcome!", JLabel.CENTER);

        // Create a button with the label "Click Me"
        JButton button = new JButton("Click Me");

        // Add an event listener to the button to change label text when clicked
        button.addActionListener(e -> label.setText("Hello, Khushi!"));

        // Add the label to the top (North) of the frame
        frame.add(label, "North");

        // Add the button to the bottom (South) of the frame
        frame.add(button, "South");

        // Set the size of the window to 300x150 pixels
        frame.setSize(300, 150);

        // Make the window visible
        frame.setVisible(true);

        // Exit the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
