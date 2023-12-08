import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class hellocutie extends JFrame {

    hellocutie(){
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        JLabel l = new JLabel("Hello cutie");
        JButton b = new JButton ("hii");
        JButton b1 = new JButton("holla");
        l.setBounds(200,150,100,100);
        b.setBounds(150,280,50,50 );
        b1.setBounds(250,280,50,50 );
        add(l); add(b); add(b1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
       new hellocutie();
    }
}
