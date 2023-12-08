import java.awt.*;
import java.awt.event.*;

public class Compodemo extends Frame implements ComponentListener {
    Checkbox c1;
    Checkbox c2;
    TextField tf = new TextField();

    Compodemo(){
        c1 = new Checkbox("C++");
        add(c1, BorderLayout.NORTH);
        
        c2 = new Checkbox("Java");
        add(c2, BorderLayout.SOUTH);

        add(tf, BorderLayout.CENTER);

        setSize(400,400);
        setVisible(true);
        addComponentListener(this);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
               dispose();
            }
          }
          );
      
    }

    public void componentShown(ComponentEvent e){
        System.out.println("Component Shown ");
    }
    public void componentHidden(ComponentEvent e){
        System.out.println("Component Hidded ");
    }
    public void componentMoved(ComponentEvent e){
        System.out.println("Component Moved");
    }
    public void componentResized(ComponentEvent e){
        System.out.println("Component Resized ");
    }
    public static void main(String[] args) {
        new Compodemo();
    }
    
}
