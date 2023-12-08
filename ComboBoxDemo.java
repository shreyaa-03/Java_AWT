import javax.swing.*;
import java.awt.event.*;

public class ComboBoxDemo extends JFrame implements ItemListener{
    JComboBox b;
    JLabel l = new JLabel();

    ComboBoxDemo(){
        String color[] = {"apple","food12"};
        b = new JComboBox<>(color);
        b.setBounds(50,50,100,100);
        l.setBounds(50,150,100,100);
        add(b);add(l);
        b.addItemListener(this);
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        

}
    public void itemStateChanged(ItemEvent e){
    String s = (String)e.getItem();
    l.setIcon(new ImageIcon("images/" +s + ".png"));
    }
   
    public static void main(String[] args) {
        new ComboBoxDemo();
    }
}
