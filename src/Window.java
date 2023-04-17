import javax.swing.*;
import java.awt.*;


public class Window{

    public Window() {

        JFrame frame = new JFrame();
        frame.setTitle("Title of Window");// JFrame ("The title of the window goes in here")
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textLabel = new JLabel("Window Label!", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[]args) {

        Window window = new Window();



    }
}
