import java.awt.*;
import java.awt.event.*;

public class Keydemo extends Frame implements KeyListener {
    TextField tf = new TextField();
    Label l1 = new Label();
    Label l2 = new Label();
    Label l3 = new Label();
    Keydemo(){
      setSize(400,400);
      setVisible(true);
      setLayout(null);

      tf.setBounds(50,50,100,100);
      l1.setBounds(50,250,100,100);
      l2.setBounds(50,300,100,100);
      l3.setBounds(50,350,100,100);
      add(l1); add(tf);
      add(l2);
      add(l3); 
      tf.addKeyListener(this);
    addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e){
           dispose();
        }

      }
      );
    }
    public void keyPressed(KeyEvent e){
        l1.setText("Pressed: " + e.getKeyChar());
    }
    public void keyTyped(KeyEvent e){
        l1.setText("Typed: " + e.getKeyCode());
    }
    public void keyReleased(KeyEvent e){
        l1.setText("Released: " + e.getKeyChar());
    }
     
    
    public static void main(String[] args) {
        new Keydemo();
     }
}
