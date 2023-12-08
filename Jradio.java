import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jradio extends JFrame implements ActionLitener, ActionListener {
    JRadioButton r1 =  new JRadioButton("Female");;
    JRadioButton r2 = new JRadioButton("Male");
    JRadioButton r3 = new JRadioButton("Gay");
    JLabel l = new JLabel();
    JPanel p = new JPanel();
    Jradio(){
      l.setHorizontalAlignment(JLabel.RIGHT);
    ButtonGroup bb = new ButtonGroup();
   
    bb.add(r1);
    bb.add(r2);
    bb.add(r3);
    p.add(r1);
    p.add(r2);
    p.add(r3);
    p.add(l);
    add(p);
    r1.addActionListener(this);;
    // r1.setActionCommand("You have selected Female");
    r2.addActionListener(this);
    r3.addActionListener(this);
    
    setSize(500,500);
    setLocationRelativeTo(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e){
      if(r1.isSelected()){
        l.setText("r1 selected");
      }
      else if(r2.isSelected()){
        l.setText("r2 is selected");
      }
      else if(r3.isSelected()){
        l.setText("r3 is selected");
      }
    }
    public static void main(String[] args) {
        new Jradio();
    }
    
}
