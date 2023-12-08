import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jscrollpane extends JFrame {
    JTextArea t;
    Jscrollpane(){
        t = new JTextArea(20,2);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane p = new JScrollPane(t,v,h);
        add(p);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public static void main(String[] args) {
        new Jscrollpane();
    }
}
