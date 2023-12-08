import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Prac2 extends JFrame implements ActionLitener, ActionListener{
    JButton b = new JButton("Book Show");
    JLabel l = new JLabel();
   JLabel l1 = new JLabel();
   

    Prac2(){
    this.setSize(700,700);
    this.setVisible(true);
    b.setBounds(50,50,100,100);
    l.setBounds(50,150,550,100);
    l1.setBounds(50,300,550,100);
    b.addActionListener(this);
    this.add(b);
    this.add(l);
    this.add(l1);
   
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
    l.setText("Movie: Dhoom3 Price: Rs 500"+ "\n"+"Movie: Small Wonder Price: Rs 700");
    // l1.setText("");
    }

    public static void main(String[] args) {
        new Prac2();
    }
}
