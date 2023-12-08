import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JtextFieldarea extends JFrame implements ActionLitener, ActionListener{
    JTextArea a;
    JTextField tf;
    JButton b;
    JLabel l;
    JLabel l1;

    JtextFieldarea(){
        l = new JLabel();
        l1 = new JLabel();
        b = new JButton("Press");
     tf = new JTextField();
   //   a.insert("F ",0);
   //   a.append("Welcome Bitch");
     tf.setBounds(50,50,100,100);
     a = new JTextArea();
     a.setBounds(50,180,100,100);
     b.setBounds(50,300,100,60);
     l.setBounds(50,380,100,60);
     l1.setBounds(50,460,100,60);
     add(tf);
     add(a);
     add(b);
     add(l);
     add(l1);
     b.addActionListener(this);
     setSize(580,580);
     setVisible(true);
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
     
     public void actionPerformed(ActionEvent e){
         a.insert("F ",0);
     a.append("Welcome Bitch");
        String s = tf.getText();
        l.setText(s + "Welcome " + s.length());
        // String s1 = a.getText();
        // l1.setText("Text: " + s1);
     }
     
    
  public static void main(String[] args) {
    
    new JtextFieldarea();
    
  }
    
}
