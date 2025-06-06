import java.awt.*;
import javax.swing.*;

public class EmployeeManagerGUI {
    public static void main(String[] args) {
        // Run GUI on Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            new RoleSelectionScreen();
        });
    }
}

// Screen for choosing Employee or Manager
class RoleSelectionScreen extends JFrame {
    public RoleSelectionScreen() {
        setTitle("Select Role");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center screen

        JButton employeeBtn = new JButton("Employee");
        JButton managerBtn = new JButton("Manager");

        employeeBtn.addActionListener(e -> {
            new EmployeeForm();
            dispose();
        });

        managerBtn.addActionListener(e -> {
            new ManagerForm();
            dispose();
        });

        // Layout
        setLayout(new GridLayout(2, 1, 10, 10));
        add(employeeBtn);
        add(managerBtn);

        setVisible(true);
    }
}

// Employee Form
class EmployeeForm extends JFrame {
    public EmployeeForm() {
        setTitle("Employee Form");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel idLabel = new JLabel("Employee ID:");
        JTextField idField = new JTextField();

        JLabel deptLabel = new JLabel("Department:");
        JTextField deptField = new JTextField();

        JButton submitBtn = new JButton("Submit");

        submitBtn.addActionListener(e -> {
            String name = nameField.getText();
            String id = idField.getText();
            String dept = deptField.getText();

            JOptionPane.showMessageDialog(this,
                    "Employee Info:\nName: " + name + "\nID: " + id + "\nDepartment: " + dept);
        });

        setLayout(new GridLayout(4, 2, 5, 5));
        add(nameLabel);
        add(nameField);
        add(idLabel);
        add(idField);
        add(deptLabel);
        add(deptField);
        add(new JLabel()); // for spacing
        add(submitBtn);

        setVisible(true);
    }
}

// Manager Form
class ManagerForm extends JFrame {
    public ManagerForm() {
        setTitle("Manager Form");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel idLabel = new JLabel("Manager ID:");
        JTextField idField = new JTextField();

        JLabel teamLabel = new JLabel("Team Size:");
        JTextField teamField = new JTextField();

        JButton submitBtn = new JButton("Submit");

        submitBtn.addActionListener(e -> {
            String name = nameField.getText();
            String id = idField.getText();
            String teamSize = teamField.getText();

            JOptionPane.showMessageDialog(this,
                    "Manager Info:\nName: " + name + "\nID: " + id + "\nTeam Size: " + teamSize);
        });

        setLayout(new GridLayout(4, 2, 5, 5));
        add(nameLabel);
        add(nameField);
        add(idLabel);
        add(idField);
        add(teamLabel);
        add(teamField);
        add(new JLabel()); // spacing
        add(submitBtn);

        setVisible(true);
    }
}