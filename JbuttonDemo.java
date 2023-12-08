import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JbuttonDemo extends JFrame implements ActionListener{
    
    // JFrame f;
    JLabel l1 = new JLabel("This is an icon button");
    JButton b;
    JLabel l;
    JPanel p = new JPanel();
    JbuttonDemo(){
       
        ImageIcon i = new ImageIcon("images/food12.png");
        b = new JButton(i);
        // b.setBounds(10,10,300,300);
        b.addActionListener(this);
        b.setActionCommand("This is food image ");
        l = new JLabel();
        // l.setBounds(150,900,100,100);
        p.add(l1);
        p.add(b);
        p.add(l);
        add(p);
        setSize(900,900);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
        l.setText(e.getActionCommand());
        b.setEnabled(false); //it will enable the button after pressig it once
    }
    public static void main(String[] args) {
        new JbuttonDemo();
    }
  
}