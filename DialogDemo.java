import javax.swing.*;  // Import JOptionPane and other Swing classes

public class DialogDemo {
    public static void main(String[] args) {

        // Ask the user to enter their name (Input Dialog)
        String name = JOptionPane.showInputDialog("Enter your name:");

        // Display a welcome message with the entered name (Message Dialog)
        JOptionPane.showMessageDialog(null, "Welcome, " + name);
    }
}
