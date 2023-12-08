import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Jlabelicon extends JFrame implements ActionListener{
    JLabel l;
    JLabel l3;
    JButton b;
    JFrame f;
    JPanel p;
    
    Jlabelicon(){
        JFrame f = new JFrame("JLabel");
        JPanel p = new JPanel();
        p.setBackground(Color.LIGHT_GRAY);
        JLabel l = new JLabel("This is an icon");
        p.add(l);
        // ImageIcon i = new ImageIcon("image.png");
       
        // JLabel l1 = new JLabel(Icon.);
        JLabel l3 = new JLabel();
        p.add(l3);
        JButton b = new JButton("Click here");
        p.add(b);
        b.addActionListener((ActionListener) this);
        f.add(p);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
         String s = l.getText();
         l3.setText("Copied text: " + s);
 
        }
        public static void main(String[] args) {
        new Jlabelicon();
        
    }
        public JLabel getL() {
            return l;
        }
        public void setL(JLabel l) {
            this.l = l;
        }
        public JLabel getL3() {
            return l3;
        }
        public void setL3(JLabel l3) {
            this.l3 = l3;
        }
        public JButton getB() {
            return b;
        }
        public void setB(JButton b) {
            this.b = b;
        }
        public JFrame getF() {
            return f;
        }
        public void setF(JFrame f) {
            this.f = f;
        }
        public JPanel getP() {
            return p;
        }
        public void setP(JPanel p) {
            this.p = p;
        }

}