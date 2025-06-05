import java.awt.*;
public class GUIAwt {
    public static void main(String[] args) {
        Frame f = new Frame("AWT GUI Example");
        Label l = new Label("Enter Username: ");
        l.setBounds(50, 50, 50, 30);
        f.add(l);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
