import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class LeaveManagementSystem {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainMenu());
    }
}

// Leave model to store data
class Leave {
    String name, date, reason;

    Leave(String name, String date, String reason) {
        this.name = name;
        this.date = date;
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Date: " + date + " | Reason: " + reason;
    }
}

// Shared storage
class LeaveData {
    public static ArrayList<Leave> leaveList = new ArrayList<>();
}

// Main menu
class MainMenu extends JFrame {
    public MainMenu() {
        setTitle("Leave Management");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton applyBtn = new JButton("Apply Leave");
        JButton viewBtn = new JButton("View Leaves");

        applyBtn.addActionListener(e -> {
            new ApplyLeaveForm();
            dispose();
        });

        viewBtn.addActionListener(e -> {
            new ViewLeaves();
            dispose();
        });

        setLayout(new GridLayout(2, 1, 10, 10));
        add(applyBtn);
        add(viewBtn);

        setVisible(true);
    }
}

// Apply leave form
class ApplyLeaveForm extends JFrame {
    public ApplyLeaveForm() {
        setTitle("Apply for Leave");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel dateLabel = new JLabel("Leave Date (YYYY-MM-DD):");
        JTextField dateField = new JTextField();

        JLabel reasonLabel = new JLabel("Reason:");
        JTextField reasonField = new JTextField();

        JButton submitBtn = new JButton("Submit");
        JButton backBtn = new JButton("Back");

        submitBtn.addActionListener(e -> {
            String name = nameField.getText().trim();
            String date = dateField.getText().trim();
            String reason = reasonField.getText().trim();

            if (!name.isEmpty() && !date.isEmpty() && !reason.isEmpty()) {
                LeaveData.leaveList.add(new Leave(name, date, reason));
                JOptionPane.showMessageDialog(this, "Leave Applied Successfully!");
                nameField.setText("");
                dateField.setText("");
                reasonField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all fields.");
            }
        });

        backBtn.addActionListener(e -> {
            new MainMenu();
            dispose();
        });

        setLayout(new GridLayout(5, 2, 5, 5));
        add(nameLabel);
        add(nameField);
        add(dateLabel);
        add(dateField);
        add(reasonLabel);
        add(reasonField);
        add(submitBtn);
        add(backBtn);

        setVisible(true);
    }
}

// View leave list
class ViewLeaves extends JFrame {
    public ViewLeaves() {
        setTitle("View Leaves");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextArea leaveArea = new JTextArea();
        leaveArea.setEditable(false);

        if (LeaveData.leaveList.isEmpty()) {
            leaveArea.setText("No leave applications found.");
        } else {
            for (Leave leave : LeaveData.leaveList) {
                leaveArea.append(leave.toString() + "\n");
            }
        }

        JButton backBtn = new JButton("Back");
        backBtn.addActionListener(e -> {
            new MainMenu();
            dispose();
        });

        setLayout(new BorderLayout());
        add(new JScrollPane(leaveArea), BorderLayout.CENTER);
        add(backBtn, BorderLayout.SOUTH);

        setVisible(true);
    }
}