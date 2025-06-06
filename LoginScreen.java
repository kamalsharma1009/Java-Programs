import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginScreen extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel errorLabel;
    private EmployeeLogin empLogin;

    public LoginScreen() {
        empLogin = new EmployeeLogin(); 

        setTitle("Login Screen");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center screen

        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");
        errorLabel = new JLabel();
        errorLabel.setForeground(Color.RED);

        setLayout(new GridLayout(4, 1, 5, 5));
        add(new JLabel("Username:"));
        add(usernameField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(loginButton);
        add(errorLabel);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performLogin();
            }
        });
    }

    private void performLogin() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (empLogin.checkLogin(username, password)) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            dispose(); // close login screen
            // You can load dashboard or main window here
        } else {
            errorLabel.setText("Invalid credentials");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginScreen().setVisible(true);
        });
    }
}

// Dummy class for login checking (You can replace this with your own logic)
class EmployeeLogin {
    public boolean checkLogin(String username, String password) {
        // Dummy credentials: user - admin, pass - admin
        return username.equals("admin") && password.equals("admin");
    }
}
