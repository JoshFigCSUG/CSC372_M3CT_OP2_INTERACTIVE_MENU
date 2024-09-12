import javax.swing.*;

public class InteractiveMenuOrange extends JFrame {
    public InteractiveMenuOrange() {
        setTitle("Interactive Menu Orange");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Menu Bar and Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");

        // Create MenuItems 1 through 4
        JMenuItem printDateTimeMenuItem = new JMenuItem("Print Date and Time");
        JMenuItem saveToLogMenuItem = new JMenuItem("Save to log.txt");
        JMenuItem colorChangeMenuItem = new JMenuItem("Change Background Color. Current Hue: 0");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        
        setJMenuBar(menuBar);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new InteractiveMenuOrange().setVisible(true);
        });
    }

}