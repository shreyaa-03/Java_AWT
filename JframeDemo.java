import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JframeDemo extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frame");
        JWindow w = new JWindow(f);
        JLabel l = new JLabel("Hello this is a Window");
        JPanel p2 = new JPanel();
        p2.setBackground(Color.lightGray);
        p2.add(l);
        w.add(p2);
        JPanel p = new JPanel();
        p.setBackground(Color.PINK);
        
        JButton b = new JButton("OK");
        p.add(b);
        f.add(p);
        f.setSize(500,500);
        f.setVisible(true);
        w.setSize(200,200);
        w.setVisible(true);
        w.setLocation(150,100);
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
}