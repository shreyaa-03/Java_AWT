import java.awt.*;
import java.awt.event.*;
public class Textdemo implements TextListener{
Label l;
TextField tf ;
Frame f;

Textdemo(){
    f = new Frame();
    tf = new TextField();
    tf.setBounds(50,50,100,100);
    l = new Label();
    l.setBounds(50,150,100,100);
    tf.addTextListener(this);
    f.add(tf);
    f.add(l);
    f.setSize(400,400);
    f.setVisible(true);
    f.setLayout(null);
    f.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosing(WindowEvent e ){
            f.dispose();
        }
    }
    );


}

public void textValueChanged(TextEvent e){
    l.setText("Value: " + tf.getText());
}

    public static void main(String[] args) {
        new Textdemo();
    
}
    
}