 import javax.swing.*;

public class SwingPanesDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Pane Types");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // --- JTabbedPane Example ---
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel tab1 = new JPanel();
        tab1.add(new JLabel("Welcome to Tab 1"));

        JPanel tab2 = new JPanel();
        tab2.add(new JLabel("This is Tab 2"));

        tabbedPane.addTab("Home", tab1);
        tabbedPane.addTab("Settings", tab2);

        // --- JSplitPane Example ---
        JTextArea left = new JTextArea("Left Panel");
        JTextArea right = new JTextArea("Right Panel");
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, left, right);
        splitPane.setDividerLocation(150); // Set initial divider position

        // --- JLayeredPane Example ---
        JLayeredPane layeredPane = new JLayeredPane();
        JLabel background = new JLabel("Base Layer");
        background.setBounds(50, 50, 100, 30);

        JButton buttonTop = new JButton("Click Me");
        buttonTop.setBounds(70, 70, 100, 30);

        layeredPane.add(background, Integer.valueOf(0)); // Lower layer
        layeredPane.add(buttonTop, Integer.valueOf(1));  // Upper layer

        layeredPane.setPreferredSize(new java.awt.Dimension(300, 150));

        // --- Final Panel to Hold All ---
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(tabbedPane);
        mainPanel.add(splitPane);
        mainPanel.add(layeredPane);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
 
