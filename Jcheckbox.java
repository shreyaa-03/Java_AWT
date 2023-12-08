import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Jcheckbox extends JFrame implements  ItemListener{
    // JPanel p = new JPanel();
    // JButton b = new JButton("Show");
    // ImageIcon i = new ImageIcon("images/food12.png");
    JCheckBox cb = new JCheckBox("Java");
    JCheckBox cb1 = new JCheckBox("Python");
    JLabel l2 = new JLabel();
    JLabel l1 = new JLabel();

    Jcheckbox(){
    // this.add(b);
    // b.setBounds(50,50,100,100);
    cb.setBounds(100,50,100,100);
    l1.setBounds(100,100,300,60);
    cb1.setBounds(100,120,100,100);
    l2.setBounds(100,180,100,100);
   
    add(cb);
    add(l1);
    add(cb1);
    add(l2);
    
    cb.addItemListener(this);
    cb1.addItemListener(this);
    this.setSize(500,500);
    // this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
  
  public void itemStateChanged(ItemEvent e){
    // JCheckBox cb = (JCheckBox)e.getItem();
    // l2.setText(cb.getText());
    // JCheckBox cb1 = (JCheckBox)e.getItem();
    // l1.setText(cb1.getText());
    // if((JCheckBox)e.getSource()==cb){
    //     String s = cb.getText();
    //     l1.setText(s);
        
    // }
    // //if(){//if both the labels are to be printed}
    // else if((JCheckBox)e.getSource()==cb1){
    //     String s1 = cb1.getText();
    //     l2.setText(s1);
    // }
    JCheckBox cb = (JCheckBox)e.getItem();
    // String cb = (String)e.getItem();
    l1.setText("Selected: " + cb);
  }
  
    public static void main(String[] args) {
    new Jcheckbox();
  }  
}
