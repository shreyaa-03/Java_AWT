import java.awt.*;
import java.awt.event.*;

public class Focusdemo extends Frame implements FocusListener{
    Label l1, l2;
    Button Okay, Cancel;
    Focusdemo(){
        setSize(550,400);
        setVisible(true);
        setLayout(null);

        l1 = new Label();
        l2 = new Label();
        Okay = new Button("Okay");
        Cancel = new Button("Cancel");

        Okay.setBounds(50,50,60,60);
        Cancel.setBounds(50,150,60,60);
        l1.setBounds(50,250,480,60);
        l2.setBounds(50,300,480,60);
        add(Cancel);add(Okay); add(l1); add(l2);

        Okay.addFocusListener(this);
        Cancel.addFocusListener(this);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
               dispose();
            }
          }
          );
    }
    public void focusGained(FocusEvent e){
        l1.setText("focus gained: "+ e.getSource());
    }
    public void focusLost(FocusEvent e){
        l2.setText("focus lost: "+ e.getSource());
    }
    public static void main(String[] args) {
        new Focusdemo();
    }
}
