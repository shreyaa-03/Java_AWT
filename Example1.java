import java.awt.*;
import javax.swing.*;

public class Example1 extends JFrame{
    JPanel p;
    JRadioButton b1 = new JRadioButton("java");
    JRadioButton b2 = new JRadioButton("python");

    Example1(){
        p = new JPanel();
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        p.add(b1);
        p.add(b2);
        this.add(p);
        this.setSize(400,400);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }
    public static void main(String[] args) {
        new Example1();
    }
    
}
