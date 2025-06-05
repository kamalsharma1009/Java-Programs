import javax.swing.*;
import java.awt.*;
public class GUISwing {
	public static void main(String[] args) {
	    JFrame frame = new JFrame("Swing GUI Example");
        JLabel label1 = new JLabel("Enter Username: ");
        JLabel label2 = new JLabel("Enter Password: ");
        JTextField textField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);
        JButton button = new JButton("Submit");
        frame.add(label1);
        frame.add(textField);
        frame.add(label2);
        frame.add(passwordField);
        frame.add(button);
        frame.setLayout(new GridLayout(3, 2));
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
