import java.awt.event.*;
import javax.swing.*;


public class Prac9 extends JFrame implements ActionLitener, ActionListener{
    JLabel l1 = new JLabel("Order No: ");
    JLabel l2 = new JLabel("1");
    JLabel l3 = new JLabel("Food Items: ");
    JTextArea a = new JTextArea();
    JButton b = new JButton("Show");
    // JButton b1 = new JButton("Wheat");
    JRadioButton c1 = new JRadioButton("Rice");
    JRadioButton c2 = new JRadioButton("Wheat");

    Prac9(){
    setSize(750,750);
    setVisible(true);
    setLayout(null);
    ButtonGroup bg = new ButtonGroup();
    bg.add(c1);
    bg.add(c2);

    l1.setBounds(50,50,80,80);
    l2.setBounds(150,50,80,80);
    l3.setBounds(50,150,80,80);
    c1.setBounds(150,150,80,80);
    c2.setBounds(150,210,80,80);
    b.setBounds(150,310,80,80);
    a.setBounds(50,420,400,100);
    add(l1);
    add(l2);
    add(l3);
    add(c1);
    add(c2);
    add(b);
    add(a);
    // c1.addActionListener(this);
    // c2.addActionListener(this);
    b.addActionListener(this);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
    public void actionPerformed(ActionEvent e){
        if(c1.isSelected()){
            a.setText("Hello" + "\n" + "Your order no is: 1"+ "\n"
                + "Rice = Rs 50" + "\n");
        }
        else if(c2.isSelected()){
            a.setText("Hello" + "\n" + "Your order no is: 1"+ "\n"
                + "Wheat = Rs 70" + "\n");
        }

        // a.setText(
        //     "Hello" + "\n" + "Your order no is: 1"+ "\n"
        //     + "Rice = Rs 50" + "\n"+
        //     "Wheat = Rs 70"
        // );

    }
    public static void main(String[] args) {
        new Prac9();
    }
    
}
