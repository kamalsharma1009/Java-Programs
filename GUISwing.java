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
        // JRadioButton r1 = new JRadioButton("Male"); 
        // JRadioButton r2 = new JRadioButton("Female"); 
        // ButtonGroup bg = new ButtonGroup(); 
        // bg.add(r1); 
        // bg.add(r2); 
        // frame.add(r1);
        // frame.add(r2);
        frame.setLayout(new GridLayout());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}