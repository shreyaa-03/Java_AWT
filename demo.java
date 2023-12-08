import java.awt.*;

import javax.swing.JTabbedPane;



public class demo extends Frame {
   
    demo(){
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        JTabbedPane tp = new JTabbedPane();
        tp.add("Register", p1);
        tp.add("Payment", p2);
        tp.setBounds(50,50,200,200);
        add(tp);
        setSize(400,400);
        setVisible(true);
        setLayout(null);

}

public static void main(String[] args) {
    new demo();
    }
    
}
