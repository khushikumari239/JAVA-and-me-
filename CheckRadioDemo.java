import javax.swing.*;  // Import Swing classes

public class CheckRadioDemo {
    public static void main(String[] args) {

        // Create the main window (JFrame) with a title
        JFrame f = new JFrame("Checkbox and Radio Demo");

        // Create two checkboxes for language selection (multiple selections allowed)
        JCheckBox cb1 = new JCheckBox("Java");     // Checkbox for Java
        JCheckBox cb2 = new JCheckBox("Python");   // Checkbox for Python

        // Create two radio buttons for gender selection (only one selection allowed)
        JRadioButton r1 = new JRadioButton("Male");     // Radio button for Male
        JRadioButton r2 = new JRadioButton("Female");   // Radio button for Female

        // Group the radio buttons so that only one can be selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(r1);  // Add Male to the group
        group.add(r2);  // Add Female to the group

        // Create a panel to organize all the components
        JPanel p = new JPanel();
        p.add(cb1);     // Add Java checkbox to the panel
        p.add(cb2);     // Add Python checkbox to the panel
        p.add(r1);      // Add Male radio button to the panel
        p.add(r2);      // Add Female radio button to the panel

        // Add the panel to the frame
        f.add(p);

        // Set the window size (width=300, height=200)
        f.setSize(300, 200);

        // Make the window visible
        f.setVisible(true);

        // Ensure the application exits when the window is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
