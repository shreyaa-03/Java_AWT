import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ColorChange implements ActionLitener, ActionListener {
    JButton red = new JButton("red");
    JButton green = new JButton("green");
    JButton blue = new JButton("blue");
    JFrame f = new JFrame();
    JPanel p = new JPanel();
    ColorChange(){
    p.add(red); p.add(green); p.add(blue);
    red.addActionListener(this);
    green.addActionListener(this);
    blue.addActionListener(this);
    f.add(p);
   
    f.setSize(400,400);
    //f.setLocationRelativeTo(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e){
    if(e.getSource()==red){
        p.setBackground(Color.red);
    }
    else if(e.getSource()==green){
        p.setBackground(Color.green);
    }
    else if(e.getSource()==blue){
        p.setBackground(Color.blue);
    }
    }
    public static void main(String[] args) {
        new ColorChange();
    }
    
}
