import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class d5 extends JFrame implements ActionLitener, ActionListener{
    JButton b = new JButton("Okay");
    JTextArea t = new JTextArea();
    JDialog jd;
    JLabel l ;
    d5(){
        
        t.setBounds(50, 50,100,200);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(t);

        jd = new JDialog();
        l = new JLabel("Wanna continue?");
        l.setBounds(50,10,120,60);
        b.setBounds(50,150,100,60);
        jd.add(l);
        jd.add(b);
        b.addActionListener(this);
        jd.setSize(200,200);
        jd.setVisible(true);
        jd.setLayout(null);
        jd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(jd);
       
    }
    public void actionPerformed(ActionEvent e){
        jd.setVisible(false);
    }
    public static void main(String[] args) {
        new d5();
    }
}