import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.*;

public class Prac5 extends JFrame implements ChangeListener {
    JTextArea tf = new JTextArea();
    // JLabel l = new JLabel();
    
    JSlider s;
    Prac5(){
    JPanel p = new JPanel();
    s = new JSlider(JSlider.HORIZONTAL,0,50,5);
    s.setMinorTickSpacing(2);
    s.setMajorTickSpacing(10);
    s.setPaintLabels(true);
    s.setPaintTicks(true);
    p.add(s);
    // p.add(l);
    p.add(tf);
    add(p);
    s.addChangeListener(this);
    setSize(400,400);
    setVisible(true);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void stateChanged(ChangeEvent e){
        String ss = String.valueOf(s.getValue());
        tf.setText("Value is: " + ss);

    }
    public static void main(String[] args) {
        new Prac5();
    }
    
}
