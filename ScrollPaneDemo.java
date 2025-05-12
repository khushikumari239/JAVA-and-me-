 import javax.swing.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("ScrollPane Example");

        // Create a text area with 10 rows and 20 columns
        JTextArea textArea = new JTextArea(10, 20);

        // Add long sample text to test scrolling
        textArea.setText("This is a long paragraph...\n".repeat(20)); // Adds 20 lines

        // Wrap the text area inside a scroll pane
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add the scroll pane (not the text area directly) to the frame
        frame.add(scrollPane);

        // Set size and visibility
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
 
