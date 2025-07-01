public class ToDoApp {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new ToDoFrame().setVisible(true);
        });
    }
}
