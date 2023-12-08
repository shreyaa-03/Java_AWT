import java.awt.*;
import java.awt.event.*;

public class Windowdemo  extends Frame implements WindowListener {
    Windowdemo(){
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    
        Button b = new Button("Click");
        b.setBounds(50,100,100,100);
        add(b);
    
        addWindowListener(this);
    
    }

   public void windowActivated(WindowEvent e){
    System.out.println("Window activated");
   }
   public void windowOpened(WindowEvent e){
    System.out.println("Window opened");
   }
   public void windowDeactivated(WindowEvent e){
    System.out.println("Window deactivated");
   }
   public void windowClosed(WindowEvent e){
    System.out.println("Window closed");
   }
   public void windowClosing(WindowEvent e){
    System.out.println("Window closing");
    dispose();
   }
   public void windowIconified(WindowEvent e){
    System.out.println("Window iconified");
   }
   public void windowDeiconified(WindowEvent e){
    System.out.println("Window deiconified");
   }
   public static void main(String[] args) {
     new Windowdemo();
   }
}
