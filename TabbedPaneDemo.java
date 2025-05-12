import javax.swing.*;  // Import all the Swing classes

public class TabbedPaneDemo {
    public static void main(String[] args) {

        // Create the main window (JFrame) with title "Tabs Example"
        JFrame frame = new JFrame("Tabs Example");

        // Create a JTabbedPane instance to hold different tabs
        JTabbedPane tabs = new JTabbedPane();

        // Create first tab content inside a JPanel
        JPanel p1 = new JPanel();                          // Panel for Home tab
        p1.add(new JLabel("This is Home"));                // Add a label to the Home tab panel

        // Create second tab content inside another JPanel
        JPanel p2 = new JPanel();                          // Panel for Settings tab
        p2.add(new JLabel("This is Settings"));            // Add a label to the Settings tab panel

        // Add both panels to the tabbed pane as tabs
        tabs.add("Home", p1);       // Adds first tab with title "Home" and component p1
        tabs.add("Settings", p2);   // Adds second tab with title "Settings" and component p2

        // Add the entire tabbed pane to the frame
        frame.add(tabs);

        // Set the size of the window to 300x200 pixels
        frame.setSize(300, 200);

        // Make the frame visible on screen
        frame.setVisible(true);

        // Exit the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
