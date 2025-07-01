import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoPanel extends JPanel {
    private DefaultListModel<String> taskModel;
    private JList<String> taskList;
    private JTextField taskField;

    public ToDoPanel() {
        setLayout(new BorderLayout(10, 10));

        // Task input field
        taskField = new JTextField();
        JButton addButton = new JButton("Add Task");
        JButton deleteButton = new JButton("Delete Selected");

        // Task list model and UI
        taskModel = new DefaultListModel<>();
        taskList = new JList<>(taskModel);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Add task button action
        addButton.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                taskModel.addElement(task);
                taskField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a task.");
            }
        });

        // Delete selected task button action
        deleteButton.addActionListener(e -> {
            int index = taskList.getSelectedIndex();
            if (index != -1) {
                taskModel.remove(index);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a task to delete.");
            }
        });

        // Top panel with input and add button
        JPanel topPanel = new JPanel(new BorderLayout(5, 5));
        topPanel.add(taskField, BorderLayout.CENTER);
        topPanel.add(addButton, BorderLayout.EAST);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(deleteButton, BorderLayout.SOUTH);
    }
}
