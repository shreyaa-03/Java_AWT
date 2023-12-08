import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JsliderDemo extends Frame implements ChangeListener{
    JTextArea t = new JTextArea();
    JSlider j;
    
    JsliderDemo(){
        JPanel p = new JPanel();
        j = new JSlider(JSlider.HORIZONTAL,0,50,10);
        j.setMajorTickSpacing(10);
        j.setMinorTickSpacing(2);
        j.setPaintTicks(true);
        j.setPaintLabels(true);
        // j.setPaintTrack(true);
        p.add(t);
        p.add(j);
        add(p);
        j.addChangeListener(this);
        setSize(500,500);
        setVisible(true);
        
       }
    
    public void stateChanged(ChangeEvent e ){
        String s = String.valueOf(j.getValue());
        t.setText("Value is: " + s);
    }
    public static void main(String[] args) {
        new JsliderDemo();
    }
    
}
