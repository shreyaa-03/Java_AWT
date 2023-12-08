import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class main extends JFrame implements ActionLitener, ActionListener {
    JButton b = new JButton("Click ");
    Panel p =  new Panel();

    main(){
    p.add(b);
    add(p);
    b.addActionListener(this);
    setSize(400,400); setVisible(true);
    

    }
    public void actionPerformed(ActionEvent e){
        Frame f = new Frame();
        f.setSize(200,200);
        f.setLayout(null);
        f.setVisible(true);
    }


    public static void main(String[] args) {
        new main();
    }
}
