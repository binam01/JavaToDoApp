import javax.swing.*;
import java.awt.*;

public class ToDoFrame extends JFrame {
    public ToDoFrame() {
        setTitle("To-Do List App");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        add(new ToDoPanel(), BorderLayout.CENTER);
    }
}
