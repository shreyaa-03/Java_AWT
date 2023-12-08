import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo 
// implements TreeSelectionListener
{
    JFrame f;
    JTree j;
    // JLabel l = new JLabel();
    JTreeDemo(){
        f =new JFrame();
        // l.setBounds(150,150, 0, 0);
    DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
    DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
    DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
    style.add(color);
    style.add(font);
    DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
    DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
    DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
    color.add(red);
    color.add(green);
    color.add(blue);
    j = new JTree(style);
    // j.addTreeSelectionListener(this);
    f.add(j);
    // f.add(l);
    f.setSize(400,400);
    f.setVisible(true);
   
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    // public void valueChanged(TreeSelectionEvent e){
    //    l.setText("Status" + e.getPath());
    // }
   
    public static void main(String[] args) {
    
    new JTreeDemo();
    
    }}