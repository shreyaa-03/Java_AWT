import java.awt.*;
import java.awt.event.*;
// import javax.swing.*;

public class Prac3 extends Frame implements TextListener{
    TextField f = new TextField();
    Label l = new Label();
    // JButton b = new JButton("Click");
    
    Prac3(){
        this.setSize(500,600);
        this.setVisible(true);
        this.setLayout(null);
        f.setBounds(50,100,100,100);
        // b.setBounds(50,250,100,80);
        l.setBounds(50,250,100,100);
        // b.addActionListener(this);
        f.addTextListener(this);
        this.add(f);
        this.add(l);
        // this.add(b);
        // setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }
    public void textValueChanged(TextEvent e){
        
        String s = f.getText();
        l.setText(s.toUpperCase());

    }
    public static void main(String[] args)throws Exception {
        new Prac3();
    }
}
