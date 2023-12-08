import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooserExample implements ActionListener{
JFrame f;
JButton b;
// Jlabelicon l;
JTextArea ta;
ColorChooserExample(){
f=new JFrame("Color Chooser Example.");
b=new JButton("Pad Color");
b.setBounds(200,250,100,30);
ta=new JTextArea();
ta.setBounds(10,10,300,100);
// l= new Jlabelicon();
// l.setBounds(10,300,100,60);
// f.add(l);
b.addActionListener(this);
f.add(b);f.add(ta);
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

}

public void actionPerformed(ActionEvent e){
Color c=JColorChooser.showDialog(f,"select",Color.RED);
ta.setBackground(c);


}
public static void main(String[] args) {
new ColorChooserExample();
}

}