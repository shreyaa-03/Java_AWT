import java.util.List;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class javaform extends JFrame{
    JTextArea ta;
    

    javaform(){
    JScrollPane sp = new JScrollPane(ta);
    JLabel l1 = new JLabel("Name ");
    JLabel l2 = new JLabel("Password ");
    JLabel l3 = new JLabel("address");
    JLabel l4 = new JLabel("Year of Passing");
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextArea ta = new JTextArea();
   
    
    l1.setBounds(50,50,100,50);
    t1.setBounds(150,50,100,50);
    l2.setBounds(50,150,100,50);
    t1.setBounds(150,150,100,50);
    l3.setBounds(50,250,100,50);
    t2.setBounds(150,250,100,50);
    l4.setBounds(50,350,100,50);
    ta.setBounds(150,350,100,50);
    



    }
    public static void main(String[] args) {
        new javaform();
    }
    
}
